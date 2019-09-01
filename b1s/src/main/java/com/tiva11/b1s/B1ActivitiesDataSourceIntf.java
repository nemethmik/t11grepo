package com.tiva11.b1s;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import com.tiva11.model.B1Activities;
import com.tiva11.model.Event;

public interface B1ActivitiesDataSourceIntf {
    void queryActivitiesAsync(String filters, String select,
                              @NonNull final MutableLiveData<B1Activities> mldActivities,
                              @NonNull final MutableLiveData<Event<Throwable>> mldError);
}
