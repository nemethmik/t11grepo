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
import com.tiva11.model.Event;
import com.tiva11.vm.AppViewModelIntf;
import com.tiva11.vm.NotificationsForUI;
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
    private AppViewModelIntf appVM;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = LoginFragmentBinding.inflate(inflater);
        //========== DEMO OR REMOTE
        ViewModelFactory.useDemoDataSources = false;
        appVM = ViewModelFactory.getLoginVM(requireActivity());
        //========== REMEMBER TO SET THE BINDING VARIABLES AND SET THE LIFECYCLE OWNER
        binding.setLifecycleOwner(this);
        binding.setAppVM(appVM);
        //========== REMEMBER TO SET OBSERVERS AND LISTENERS, PLEASE USE METHOD REFERENCE SYNTAX
        appVM.getCommand().observe(this,this::onCommandReceived);
        appVM.getError().observe(this, e->MainActivity.onErrorReceived(e,getContext()));
        return binding.getRoot();
    }
    private void onCommandReceived(@NonNull Event<NotificationsForUI> command) {
        if(!command.hasBeenConsumed()) {
            NavController navController = Navigation.findNavController(binding.getRoot());
            String welcome = getString(R.string.welcome) + appVM.getUserDetail().getValue().getValue().get(0).getUserName();
            switch (command.consume()) {
                case LogInOKPickBranch:
                    Toast.makeText(getContext(), welcome, Toast.LENGTH_LONG).show();
                    //new ChoseBusinessPlaceDialog(appVM).show(getFragmentManager(),"ChooseBranch");
                    //navController.navigate(NavGraphDirections.toBusinessPlaceListDialogFragment());
                    navController.navigate(LoginFragmentDirections.actionLoginFragmentToBusinessPlaceListDialogFragment());
                    break;
                case BranchPickedProceedToWelcomeScreen:
                    //navController.navigate(NavGraphDirections.toWelcomeScreen());
                    navController.navigate(BusinessPlaceListDialogFragmentDirections.actionBusinessPlaceListDialogFragmentToWelcomeScreen());
                    break;
                case LogInOKNoNeedToPickBranchProceedToWelcomeScreen:
                    Toast.makeText(getContext(), welcome, Toast.LENGTH_LONG).show();
                    //navController.navigate(NavGraphDirections.toLoginFragment());
                    navController.navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeScreen());
                    break;
            }
        }
    }
//    private void onBusinessPlaceSelected(@NonNull Event<Integer> businessPlace) {
//        if(!businessPlace.hasBeenConsumed()) {
//            Toast.makeText(getContext(), "Business Partner " + businessPlace.consume() + " selected", Toast.LENGTH_SHORT).show();
//            NavController navController = Navigation.findNavController(binding.getRoot());
//            navController.navigate(NavGraphDirections.toWelcomeScreen());
//        }
//    }
}
