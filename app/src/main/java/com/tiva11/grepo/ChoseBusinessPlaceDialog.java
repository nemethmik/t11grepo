package com.tiva11.grepo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.tiva11.grepo.databinding.BusinessplaceListDialogFragmentBinding;
import com.tiva11.model.B1BusinessPlace;
import com.tiva11.vm.AppViewModelIntf;

@Deprecated
public class ChoseBusinessPlaceDialog extends DialogFragment {
    private static final String ARG_ITEM_COUNT = "item_count";
    final private AppViewModelIntf loginVM;
    private BusinessplaceListDialogFragmentBinding binding;
    private String[] businessPlaces;
    public ChoseBusinessPlaceDialog(@NonNull AppViewModelIntf viewModel){
        this.loginVM = viewModel;
        businessPlaces = new String[loginVM.getBusinessPlaces().getValue().getValue().size()];
        int i = 0;
        for(B1BusinessPlace bp : loginVM.getBusinessPlaces().getValue().getValue()) {
            businessPlaces[i] = bp.getBPLID().toString() + " - " + bp.getBPLName();
            i++;
        }
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireActivity());
        builder.setTitle("Choose Business Place")
            .setItems(businessPlaces, this::onDialogItemClicked);
        return builder.create();
    }
    private void onDialogItemClicked(DialogInterface dialog,int which) {
        //dialog.dismiss();
        loginVM.onBusinessPlaceChosen(loginVM.getBusinessPlaces().getValue().getValue().get(which));
    }
}

