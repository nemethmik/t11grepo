package com.tiva11.grepo;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.tiva11.grepo.databinding.BusinessplaceListDialogFragmentBinding;
import com.tiva11.grepo.databinding.BusinessplaceListDialogItemBinding;
import com.tiva11.vm.B1LoginVMIntf;
import com.tiva11.vm.ViewModelFactory;

import androidx.fragment.app.Fragment;
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

    // TODO: Customize parameter argument names
    private static final String ARG_ITEM_COUNT = "item_count";
//    private Listener mListener;

    //    // TODO: Customize parameters
//    public static BusinessPlaceListDialogFragment newInstance(int itemCount) {
//        final BusinessPlaceListDialogFragment fragment = new BusinessPlaceListDialogFragment();
//        final Bundle args = new Bundle();
//        args.putInt(ARG_ITEM_COUNT, itemCount);
//        fragment.setArguments(args);
//        return fragment;
//    }
    private B1LoginVMIntf loginVM;
    private BusinessplaceListDialogFragmentBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_businessplace_list_dialog, container, false);
        binding = BusinessplaceListDialogFragmentBinding.inflate(inflater);
        loginVM = ViewModelFactory.getLoginVM(requireActivity());
        //========== REMEMBER TO SET THE BINDING VARIABLES AND SET THE LIFECYCLE OWNER
        binding.setLifecycleOwner(this);
//        binding.setVM(loginVM);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //final RecyclerView recyclerView = (RecyclerView) view;
        binding.list.setLayoutManager(new LinearLayoutManager(getContext()));
        binding.list.setAdapter(new BusinessPlaceAdapter(getArguments().getInt(ARG_ITEM_COUNT),loginVM));
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        final Fragment parent = getParentFragment();
//        if (parent != null) {
//            mListener = (Listener) parent;
//        } else {
//            mListener = (Listener) context;
//        }
    }

    @Override
    public void onDetach() {
//        mListener = null;
        super.onDetach();
    }

    public interface Listener {
        void onBusinessPlaceClicked(int position);
    }

    static class BusinessPlaceAdapter extends RecyclerView.Adapter<BusinessPlaceAdapter.ViewHolder> {
        static class ViewHolder extends RecyclerView.ViewHolder {
            ViewHolder(View v) {
                super(v);
            }
        }
        private final int mItemCount;
        private final B1LoginVMIntf viewModel;
        BusinessPlaceAdapter(int itemCount, @NonNull B1LoginVMIntf vm) {
            mItemCount = itemCount;
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
            binding.setValue(position);
            binding.setVM(viewModel);
            binding.executePendingBindings();//IMPORTANT for RV
        }
        @Override
        public int getItemCount() {
            return mItemCount;
        }
    }
}

