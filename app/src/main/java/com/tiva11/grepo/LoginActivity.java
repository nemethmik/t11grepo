package com.tiva11.grepo;

import android.app.Activity;

import androidx.annotation.NonNull;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import android.widget.Toast;

import com.tiva11.grepo.databinding.ActivityLoginBinding;
import com.tiva11.model.B1Activities;
import com.tiva11.model.B1Exception;
import com.tiva11.model.B1Session;
import com.tiva11.vm.B1ActivitiesVMIntf;
import com.tiva11.vm.B1LoginVMIntf;
import com.tiva11.vm.ViewModelFactory;

public class LoginActivity extends AppCompatActivity {
    private static final String TAG = "LoginActivity";
    private B1LoginVMIntf loginVM;
    private B1ActivitiesVMIntf activitiesVM;
    private ActivityLoginBinding binding;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //setSupportActionBar(binding.); // We have no toolbar at the moment
        binding.setLifecycleOwner(this);

        loginVM = ViewModelFactory.getLoginVM(this);
        // It may happen that the CM factory creates the same VM for this interface, too
        activitiesVM = loginVM instanceof B1ActivitiesVMIntf
                ? (B1ActivitiesVMIntf) loginVM
                : ViewModelFactory.getActivitiesVM(this);
        //========== REMEMBER TO SET THE BINDING VARIABLES
        binding.setLoginVM(loginVM);
        binding.setActivitiesVM(activitiesVM);
        //========== REMEMBER TO SET OBSERVERS AND LISTENERS, PLEASE USE METHOD REFERENCE SYNTAX
        loginVM.getLoginResult().observe(this,this::onLoginResultReceived);
        loginVM.getLogoutResult().observe(this,this::onLogoutResultReceived);
        activitiesVM.getActivities().observe(this,this::onActivitiesReceived);
        loginVM.getError().observe(this, this::onErrorReceived);
        binding.password.setOnEditorActionListener(this::onEditorAction);
    }

    private void onErrorReceived(Throwable error) {
        if(error instanceof B1Exception) {
            Toast.makeText(getApplicationContext(),
                "HTTP (" + ((B1Exception)error).getResposeCode()
                + " " + ((B1Exception)error).getResponseMessage()
                + ") B1 (" + ((B1Exception)error).getB1Error().getError().getMessage().getValue()
                , Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void onLoginResultReceived(@NonNull B1Session loginResult) {
        String welcome = getString(R.string.welcome) + loginResult.getSessionId();
        Toast.makeText(getApplicationContext(), welcome, Toast.LENGTH_LONG).show();
        setResult(Activity.RESULT_OK);
        //Complete and destroy login activity once successful
        //finish();
    }
    private void onLogoutResultReceived(@NonNull Integer logoutResult) {
        Toast.makeText(getApplicationContext(), "Logout result "
                + logoutResult, Toast.LENGTH_SHORT).show();
    }
    private void onActivitiesReceived(@NonNull B1Activities b1Activities) {
        Toast.makeText(getApplicationContext(), "Number of B1 activities "
                + (b1Activities.getValue() == null ? 0 : b1Activities.getValue().size())
                , Toast.LENGTH_SHORT).show();
    }
    private boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        if (actionId == EditorInfo.IME_ACTION_DONE) {
            loginVM.loginAsync();
        }
        return false;
    }
}
