package com.tiva11.vm;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.tiva11.model.B1Activities;
import com.tiva11.model.B1Session;
import com.tiva11.model.Event;

public interface B1ActivitiesVMIntf {
    LiveData<B1Activities> getActivities();
    LiveData<Event<Throwable>> getError();
    void onQueryActivitiesAsync(String filters, String select);
}
