package com.tiva11.grepo;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
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
import com.tiva11.vm.B1LoginVMIntf;
import com.tiva11.vm.ViewModelFactory;

/**
 * A simple {@link Fragment} subclass.
 */
public class WelcomeScreen extends Fragment {
    private WelcomeScreenBinding binding;
    private B1LoginVMIntf loginVM;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = WelcomeScreenBinding.inflate(inflater);
        loginVM = ViewModelFactory.getLoginVM(requireActivity());
        binding.setLifecycleOwner(this);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController = Navigation.findNavController(view);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        loginVM = ViewModelFactory.getLoginVM(requireActivity());
//        new ChoseBusinessPlaceDialog(loginVM).show(getFragmentManager(),"ChooseBranch");
        // This callback will only be called when MyFragment is at least Started.
//        OnBackPressedCallback callback = new OnBackPressedCallback(false) {
//            @Override
//            public void handleOnBackPressed() {
//                Toast.makeText(getActivity(),"Back Button",Toast.LENGTH_SHORT).show();
//                Navigation.findNavController(binding.getRoot()).navigate(NavGraphDirections.toLoginFragment());
//            }
//        };
//        requireActivity().getOnBackPressedDispatcher().addCallback(this, callback);
    }
}
