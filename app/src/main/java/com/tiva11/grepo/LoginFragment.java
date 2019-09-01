package com.tiva11.grepo;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.tiva11.grepo.databinding.LoginFragmentBinding;
import com.tiva11.model.B1Error;
import com.tiva11.model.B1Exception;
import com.tiva11.model.B1Session;
import com.tiva11.model.Event;
import com.tiva11.vm.B1LoginVMIntf;
import com.tiva11.vm.Command;
import com.tiva11.vm.ViewModelFactory;

import static androidx.navigation.Navigation.findNavController;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    public LoginFragment() {
        // Required empty public constructor
    }
    private LoginFragmentBinding binding;
    private B1LoginVMIntf loginVM;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = LoginFragmentBinding.inflate(inflater);
        ViewModelFactory.useDemoDataSources = true;
        loginVM = ViewModelFactory.getLoginVM(requireActivity());
        //========== REMEMBER TO SET THE BINDING VARIABLES AND SET THE LIFECYCLE OWNER
        binding.setLifecycleOwner(this);
        binding.setLoginVM(loginVM);
        //========== REMEMBER TO SET OBSERVERS AND LISTENERS, PLEASE USE METHOD REFERENCE SYNTAX
        loginVM.getCommand().observe(this,this::onCommandReceived);
        loginVM.getError().observe(this, this::onErrorReceived);
        return binding.getRoot();
    }
    private void onErrorReceived(Event<Throwable> error) {
        if(!error.hasBeenConsumed()) {
            if (error.consume() instanceof B1Exception) {
                B1Exception b1Error = (B1Exception)error.peek();
                Toast.makeText(getContext(),
                        "HTTP (" + b1Error.getResposeCode()
                                + " " + b1Error.getResponseMessage()
                                + ") B1 (" + b1Error.getB1Error().getError().getMessage().getValue()
                        , Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(getContext(), error.peek().getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }
    private void onCommandReceived(@NonNull Event<Command> command) {
        if(!command.hasBeenConsumed()) {
            NavController navController = Navigation.findNavController(binding.getRoot());
            String welcome = getString(R.string.welcome) + loginVM.getLoginResult().getValue().getSessionId();
            switch (command.consume()) {
                case LogInOKPickBranch:
                    Toast.makeText(getContext(), welcome, Toast.LENGTH_LONG).show();
                    new ChoseBusinessPlaceDialog(loginVM).show(getFragmentManager(),"ChooseBranch");
                    //navController.navigate(BusinessPlaceListDialogFragmentDirections.toBusinessPlaceListDialogFragment(10));
                    //navController.navigate(LoginFragmentDirections.toBusinessPlaceListDialogFragment(100));
                    //navController.navigate(BusinessPlaceListDialogFragmentDirections.toBusinessPlaceListDialogFragment(20));
                    //navController.navigate(NavGraphDirections.toBusinessPlaceListDialogFragment(20));
                    break;
                case BranchPickedProceedToWelcomeScreen:
                    navController.navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeScreen());
                    break;
                case LogInOKNoNeedToPickBranchProceedToWelcomeScreen:
                    Toast.makeText(getContext(), welcome, Toast.LENGTH_LONG).show();
                    navController.navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeScreen());
                    break;
            }
        }
    }
    private void onBusinessPlaceSelected(@NonNull Event<Integer> businessPlace) {
        if(!businessPlace.hasBeenConsumed()) {
            Toast.makeText(getContext(), "Business Partner " + businessPlace.consume() + " selected", Toast.LENGTH_LONG).show();
            NavController navController = Navigation.findNavController(binding.getRoot());
            navController.navigate(NavGraphDirections.toWelcomeScreen());
        }
    }
//    private void onLogoutResultReceived(@NonNull Integer logoutResult) {
//        Toast.makeText(getContext(), "Logout result "
//                + logoutResult, Toast.LENGTH_SHORT).show();
//    }
//    private void onActivitiesReceived(@NonNull B1Activities b1Activities) {
//        Toast.makeText(getContext(), "Number of B1 activities "
//                        + (b1Activities.getValue() == null ? 0 : b1Activities.getValue().size())
//                , Toast.LENGTH_SHORT).show();
//    }
//    private boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
//        if (actionId == EditorInfo.IME_ACTION_DONE) {
//            loginVM.onLoginAsync();
//        }
//        return false;
//    }
}
