package com.tiva11.vm;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.tiva11.b1s.DataSourceRepository;

/**
 * ViewModel provider factory to instantiate AppViewModel.
 * Required given AppViewModel has a non-empty constructor
 */
public class ViewModelFactory{
    public static B1LoginVMIntf getLoginVM(ViewModelStoreOwner owner){
        AppViewModel vm = new ViewModelProvider(owner).get(AppViewModel.class);
        return vm.setDataSourceRepository(DataSourceRepository.getInstance());
    }
    public static B1ActivitiesVMIntf getActivitiesVM(ViewModelStoreOwner owner) {
        AppViewModel vm = new ViewModelProvider(owner).get(AppViewModel.class);
        return vm.setDataSourceRepository(DataSourceRepository.getInstance());
    }

}
