package com.tiva11.grepo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.tiva11.grepo.databinding.BusinessplaceListDialogFragmentBinding;
import com.tiva11.grepo.databinding.BusinessplaceListDialogItemBinding;
import com.tiva11.vm.AppViewModelIntf;
import com.tiva11.vm.ViewModelFactory;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * <p>A fragment that shows a list of items as a modal bottom sheet.</p>
 * <p>You can show this modal bottom sheet from your activity like this:</p>
 * <pre>
 *     BusinessPlaceListDialogFragment.newInstance(30).show(getSupportFragmentManager(), "dialog");
 * </pre>
 * <p>You activity (or fragment) needs to implement {@link BusinessPlaceListDialogFragment.Listener}.</p>
 */
public class BusinessPlaceListDialogFragment extends BottomSheetDialogFragment {
    private static final String ARG_ITEM_COUNT = "item_count";
    private AppViewModelIntf appVM;
    private BusinessplaceListDialogFragmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding = BusinessplaceListDialogFragmentBinding.inflate(inflater);
        appVM = ViewModelFactory.getLoginVM(requireActivity());
        //========== REMEMBER TO SET THE BINDING VARIABLES AND SET THE LIFECYCLE OWNER
        binding.setLifecycleOwner(this);
//        binding.setVM(appVM);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        binding.list.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.list.setAdapter(new BusinessPlaceAdapter(appVM));
    }

    static class BusinessPlaceAdapter extends RecyclerView.Adapter<BusinessPlaceAdapter.ViewHolder> {
        static class ViewHolder extends RecyclerView.ViewHolder {
            ViewHolder(View v) {
                super(v);
            }
        }
        private final AppViewModelIntf viewModel;
        BusinessPlaceAdapter(@NonNull AppViewModelIntf vm) {
            viewModel = vm;
        }
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            BusinessplaceListDialogItemBinding binding = BusinessplaceListDialogItemBinding.inflate(LayoutInflater.from(parent.getContext()));
            binding.getRoot().setTag(binding);
            return new ViewHolder(binding.getRoot());
        }
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            BusinessplaceListDialogItemBinding binding = (BusinessplaceListDialogItemBinding) holder.itemView.getTag();
            binding.setBp(viewModel.getBusinessPlaces().getValue().getValue().get(position));
            binding.setAppVM(viewModel);
            binding.executePendingBindings();//IMPORTANT for RV
        }
        @Override
        public int getItemCount() {
            return viewModel.getBusinessPlaces().getValue().getValue().size();
        }
    }
}

