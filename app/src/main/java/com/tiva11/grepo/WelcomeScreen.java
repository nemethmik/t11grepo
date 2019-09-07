package com.tiva11.grepo;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.tiva11.grepo.databinding.WelcomeScreenBinding;
import com.tiva11.model.Event;
import com.tiva11.vm.AppViewModelIntf;
import com.tiva11.vm.NotificationsForUI;
import com.tiva11.vm.ViewModelFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeScreen extends Fragment {
    private WelcomeScreenBinding binding;
    private AppViewModelIntf appVM;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = WelcomeScreenBinding.inflate(inflater);
        appVM = ViewModelFactory.getLoginVM(requireActivity());
        binding.setLifecycleOwner(this);
        binding.setAppVM(appVM);
        appVM.getCommand().observe(this,this::onCommandReceived);
        appVM.getError().observe(this, e->MainActivity.onErrorReceived(e,getContext()));
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        appVM.onWelcomeScreenOpened();
        NavController navController = Navigation.findNavController(view);
    }
    private void onCommandReceived(@NonNull Event<NotificationsForUI> command) {
        if (!command.hasBeenConsumed()) {
            NavController navController = Navigation.findNavController(binding.getRoot());
            switch (command.consume()) {
                case ShowOpenPurchaseOrdersTasksAndPendingTransactions:
//                    Toast.makeText(getContext(),
//                            "POs " + appVM.getPurchaseOrders().getValue().getValue().size()
//                                    + " Tasks " + appVM.getActivities().getValue().getValue().size()
//                                    + " for " + appVM.getUserDetail().getValue().getValue().get(0).getUserName()
//                            , Toast.LENGTH_LONG).show();
                    break;
                case ProgressInfo_TasksDataArrived:
                    Toast.makeText(getContext(), "Tasks " + appVM.getActivities().getValue().getValue().size()
                                    + " for " + appVM.getUserDetail().getValue().getValue().get(0).getUserName(),
                            Toast.LENGTH_SHORT).show();
                    break;
                case ProgressInfo_PurchaseOrdersDataArrived:
                    Toast.makeText(getContext(),
                            "POs " + appVM.getPurchaseOrders().getValue().getValue().size()
                                    + " for " + appVM.getUserDetail().getValue().getValue().get(0).getUserName()
                            , Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }
}
