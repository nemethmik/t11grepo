package com.tiva11.grepo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.tiva11.grepo.databinding.BusinessplaceListDialogFragmentBinding;
import com.tiva11.model.B1BusinessPlace;
import com.tiva11.vm.B1LoginVMIntf;
import com.tiva11.vm.ViewModelFactory;

import java.util.ArrayList;

public class ChoseBusinessPlaceDialog extends DialogFragment {
    private static final String ARG_ITEM_COUNT = "item_count";
    final private B1LoginVMIntf loginVM;
    private BusinessplaceListDialogFragmentBinding binding;
    private String[] businessPlaces;
    public ChoseBusinessPlaceDialog(@NonNull B1LoginVMIntf viewModel){
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
        loginVM.onBusinessPlaceChosen(loginVM.getBusinessPlaces().getValue().getValue().get(which).getBPLID());
    }
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        binding = FragmentBusinessplaceListDialogBinding.inflate(inflater);
//        loginVM = ViewModelFactory.getLoginVM(requireActivity());
//        //========== REMEMBER TO SET THE BINDING VARIABLES AND SET THE LIFECYCLE OWNER
//        binding.setLifecycleOwner(this);
////        binding.setVM(loginVM);
//        return binding.getRoot();
//    }
//
//    @Override
//    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
//        //final RecyclerView recyclerView = (RecyclerView) view;
//        binding.list.setLayoutManager(new LinearLayoutManager(getContext()));
//        binding.list.setAdapter(new BusinessPlaceAdapter(getArguments().getInt(ARG_ITEM_COUNT),loginVM));
//    }
//    static class BusinessPlaceAdapter extends RecyclerView.Adapter<BusinessPlaceAdapter.ViewHolder> {
//        static class ViewHolder extends RecyclerView.ViewHolder {
//            ViewHolder(View v) {
//                super(v);
//            }
//        }
//        private final int mItemCount;
//        private final B1LoginVMIntf viewModel;
//        BusinessPlaceAdapter(int itemCount, @NonNull B1LoginVMIntf vm) {
//            mItemCount = itemCount;
//            viewModel = vm;
//        }
//        @Override
//        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            FragmentBusinessplaceListDialogItemBinding binding = FragmentBusinessplaceListDialogItemBinding.inflate(LayoutInflater.from(parent.getContext()));
//            binding.getRoot().setTag(binding);
//            return new ViewHolder(binding.getRoot());
//        }
//        @Override
//        public void onBindViewHolder(ViewHolder holder, int position) {
//            FragmentBusinessplaceListDialogItemBinding binding = (FragmentBusinessplaceListDialogItemBinding) holder.itemView.getTag();
//            binding.setValue(position);
//            binding.setVM(viewModel);
//            binding.executePendingBindings();//IMPORTANT for RV
//        }
//        @Override
//        public int getItemCount() {
//            return mItemCount;
//        }
//    }
}

