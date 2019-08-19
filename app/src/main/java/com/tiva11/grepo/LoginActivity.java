package com.tiva11.grepo;

import android.app.Activity;

import androidx.lifecycle.Observer;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.tiva11.model.B1Activities;
import com.tiva11.model.B1Exception;
import com.tiva11.model.B1Session;
import com.tiva11.vm.B1ActivitiesVMIntf;
import com.tiva11.vm.B1LoginVMIntf;
import com.tiva11.vm.ViewModelFactory;

public class LoginActivity extends AppCompatActivity {

    private B1LoginVMIntf loginVM;
    private B1ActivitiesVMIntf activitiesVM;
    ProgressBar loadingProgressBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        loginVM = ViewModelFactory.getLoginVM(this);
        // It may happen that the CM factory creates the same VM for this interface, too
        activitiesVM = loginVM instanceof B1ActivitiesVMIntf
                ? (B1ActivitiesVMIntf) loginVM
                : ViewModelFactory.getActivitiesVM(this);
        final EditText usernameEditText = findViewById(R.id.username);
        final EditText passwordEditText = findViewById(R.id.password);
        final Button loginButton = findViewById(R.id.login);
        loadingProgressBar = findViewById(R.id.loading);

        loginVM.getLoginFormState().observe(this, new Observer<B1LoginVMIntf.LoginFormState>() {
            @Override
            public void onChanged(@Nullable B1LoginVMIntf.LoginFormState loginFormState) {
                if (loginFormState == null) {
                    return;
                }
                loginButton.setEnabled(loginFormState.isDataValid());
                if (loginFormState.getUsernameError() != null) {
                    usernameEditText.setError(getString(loginFormState.getUsernameError()));
                }
                if (loginFormState.getPasswordError() != null) {
                    passwordEditText.setError(getString(loginFormState.getPasswordError()));
                }
            }
        });
// This is the traditional Java 7 syntax
//        loginVM.getLoginResult().observe(this, new Observer<B1Session>() {
//            @Override
//            public void onChanged(@Nullable B1Session loginResult) {
//                loadingProgressBar.setVisibility(View.GONE);
//                if (loginResult != null) {
//                    updateUiWithUser(loginResult);
//                    setResult(Activity.RESULT_OK);
//                    //Complete and destroy login activity once successful
//                    //finish();
//                }
//            }
//        });
        //This is the classic lambda expression syntax,
        //remember in Java lambdas are only for interfaces, not generic function definitions
        //loginVM.getLoginResult().observe(this,lr->onChanged_LoginResult(lr));
        //This is the Java 8 method reference syntax.
        loginVM.getLoginResult().observe(this,this::onChanged_LoginResult);
        loginVM.getLogoutResult().observe(this,this::onChanged_LogoutResult);
        activitiesVM.getActivities().observe(this,this::onChanged_Activities);

        loginVM.getError().observe(this, new Observer<Throwable>() {
            @Override
            public void onChanged(Throwable throwable) {
                showLoginFailed(throwable);
            }
        });

        TextWatcher afterTextChangedListener = new TextWatcher() {
            @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) { }
            @Override public void onTextChanged(CharSequence s, int start, int before, int count) { }
            @Override
            public void afterTextChanged(Editable s) {
                loginVM.loginDataChanged(usernameEditText.getText().toString(),
                        passwordEditText.getText().toString());
            }
        };
        usernameEditText.addTextChangedListener(afterTextChangedListener);
        passwordEditText.addTextChangedListener(afterTextChangedListener);

        passwordEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_DONE) {
                    loginVM.loginAsync(usernameEditText.getText().toString(),
                            passwordEditText.getText().toString());
                }
                return false;
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadingProgressBar.setVisibility(View.VISIBLE);
                loginVM.loginAsync(usernameEditText.getText().toString(),
                        passwordEditText.getText().toString());
            }
        });
        findViewById(R.id.logout_button).setOnClickListener((v)->{
            loadingProgressBar.setVisibility(View.VISIBLE);
            loginVM.logoutAsync();
        });
        findViewById(R.id.query_button).setOnClickListener((v)->{
            loadingProgressBar.setVisibility(View.VISIBLE);
            activitiesVM.queryActivitiesAsync(null,null);
        });
    }

    private void updateUiWithUser(B1Session model) {
        String welcome = getString(R.string.welcome) + model.getSessionId();
        // TODO : initiate successful logged in experience
        Toast.makeText(getApplicationContext(), welcome, Toast.LENGTH_LONG).show();
    }

    private void showLoginFailed(Throwable error) {
        loadingProgressBar.setVisibility(View.GONE);
        if(error instanceof B1Exception) {
            Toast.makeText(getApplicationContext(),
                "HTTP (" + ((B1Exception)error).getResposeCode()
                + " " + ((B1Exception)error).getResponseMessage()
                + ") B1 (" + ((B1Exception)error).getB1Error().getError().getMessage().getValue()
                , Toast.LENGTH_SHORT).show();
        } else {
            //error.printStackTrace();
            Toast.makeText(getApplicationContext(), error.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    public void onChanged_LoginResult(@Nullable B1Session loginResult) {
        loadingProgressBar.setVisibility(View.GONE);
        if (loginResult != null) {
            updateUiWithUser(loginResult);
            setResult(Activity.RESULT_OK);
            //Complete and destroy login activity once successful
            //finish();
        }
    }
    public void onChanged_LogoutResult(@Nullable Integer logoutResult) {
        loadingProgressBar.setVisibility(View.GONE);
        Toast.makeText(getApplicationContext(), "Logout result "
                + logoutResult, Toast.LENGTH_SHORT).show();
    }
    public void onChanged_Activities(@Nullable B1Activities b1Activities) {
        loadingProgressBar.setVisibility(View.GONE);
        Toast.makeText(getApplicationContext(), "Number of B1 activities "
                + b1Activities.getValue().size(), Toast.LENGTH_SHORT).show();
    }
}
