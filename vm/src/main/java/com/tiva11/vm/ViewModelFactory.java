package com.tiva11.vm;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelStoreOwner;
import com.tiva11.b1s.Repository;

/**
 * ViewModel provider factory to instantiate AppViewModel.
 * Required given AppViewModel has a non-empty constructor
 */
public class ViewModelFactory{
    public static ILoginVM getLoginVM(ViewModelStoreOwner owner){
        AppViewModel vm = new ViewModelProvider(owner).get(AppViewModel.class);
        return vm.setRepository(Repository.getInstance());
    }
}
