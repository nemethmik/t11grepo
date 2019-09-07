package com.tiva11.grepo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import com.tiva11.grepo.databinding.MainActivityBinding;
import com.tiva11.model.B1Exception;
import com.tiva11.model.Event;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivityBinding binding = MainActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        binding.setLifecycleOwner(this);
        NavController navController = Navigation.findNavController(this,R.id.navHostFragment);
        AppBarConfiguration appBarConfig = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this,navController,appBarConfig);
        if(binding.bottomNavView != null) {
            NavigationUI.setupWithNavController(binding.bottomNavView,navController);
        }
    }

    public static void onErrorReceived(Event<Throwable> error, Context context) {
        if(!error.hasBeenConsumed()) {
            if (error.consume() instanceof B1Exception) {
                B1Exception b1Error = (B1Exception)error.peek();
                Toast.makeText(context,
                        "HTTP (" + b1Error.getResposeCode()
                                + " " + b1Error.getResponseMessage()
                                + ") B1 (" + b1Error.getB1Error().getError().getMessage().getValue()
                        , Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(context, error.peek().getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }
}
