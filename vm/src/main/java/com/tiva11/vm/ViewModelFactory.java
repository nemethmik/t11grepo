package com.tiva11.vm;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.tiva11.b1s.B1ServiceLocator;

/**
 * ViewModel provider factory to instantiate AppViewModelImpl.
 * Required given AppViewModelImpl has a non-empty constructor
 */
public class ViewModelFactory{
    public static boolean useDemoDataSources = false;
    public static AppViewModelIntf getLoginVM(ViewModelStoreOwner owner){
        AppViewModelImpl vm = new ViewModelProvider(owner).get(AppViewModelImpl.class);
        return vm.setB1ServiceLayer(B1ServiceLocator.getB1ServiceLayer(useDemoDataSources));
    }
}
