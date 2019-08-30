package com.tiva11.grepo;


import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import android.widget.Toast;

import com.tiva11.grepo.databinding.FragmentLoginBinding;
import com.tiva11.model.B1Activities;
import com.tiva11.model.B1Exception;
import com.tiva11.model.B1Session;
import com.tiva11.vm.B1LoginVMIntf;
import com.tiva11.vm.ViewModelFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {
    public LoginFragment() {
        // Required empty public constructor
    }
    FragmentLoginBinding binding;
    private B1LoginVMIntf loginVM;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentLoginBinding.inflate(inflater);
        ViewModelFactory.useDemoDataSources = true;
        loginVM = ViewModelFactory.getLoginVM(getActivity());
        //========== REMEMBER TO SET THE BINDING VARIABLES AND SET THE LIFECYCLE OWNER
        binding.setLifecycleOwner(this);
        binding.setLoginVM(loginVM);
        //========== REMEMBER TO SET OBSERVERS AND LISTENERS, PLEASE USE METHOD REFERENCE SYNTAX
        loginVM.getLoginResult().observe(this,this::onLoginResultReceived);
//        loginVM.getLogoutResult().observe(this,this::onLogoutResultReceived);
        loginVM.getError().observe(this, this::onErrorReceived);
//        binding.passwordTextInputEditText.setOnEditorActionListener(this::onEditorAction);

        return binding.getRoot();
    }
    private void onErrorReceived(Throwable error) {
        if(error instanceof B1Exception) {
            Toast.makeText(getContext(),
                    "HTTP (" + ((B1Exception)error).getResposeCode()
                            + " " + ((B1Exception)error).getResponseMessage()
                            + ") B1 (" + ((B1Exception)error).getB1Error().getError().getMessage().getValue()
                    , Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void onLoginResultReceived(@NonNull B1Session loginResult) {
        String welcome = getString(R.string.welcome) + loginResult.getSessionId();
        Toast.makeText(getContext(), welcome, Toast.LENGTH_LONG).show();
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
