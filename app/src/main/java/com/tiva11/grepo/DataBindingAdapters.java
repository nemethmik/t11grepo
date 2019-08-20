package com.tiva11.grepo;


import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class DataBindingAdapters {
    private static final String TAG = "DataBindingAdapters";
    @BindingAdapter("imageUrl") //No need to add app namespace, it is mandatory only for android namespace
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext())
                .load(imageUrl)
                .apply(
                        new RequestOptions().error(R.drawable.ic_launcher_background)
                )
                .into(view);
    }
    @BindingAdapter("imageCirle") //No need to add app namespace, it is mandatory only for android namespace
    public static void loadImageCircle(ImageView view, String imageUrl) {
        Glide.with(view.getContext())
                .load(imageUrl)
                .apply(
                        new RequestOptions().circleCrop().error(R.drawable.ic_launcher_background)
                )
                .into(view);
    }
    @BindingAdapter("android:text")
    public static void setText(TextView view, double number) {
        if(view != null) view.setText(String.valueOf(number));
    }
    @BindingAdapter("android:text")
    public static void setText(TextView view, float number) {
        if(view != null) view.setText(String.valueOf(number));
    }
    @BindingAdapter("android:text")
    public static void setText(TextView view, long number) {
        if(view != null) view.setText(String.valueOf(number));
    }
    @BindingAdapter("android:text")
    public static void setText(TextView view, int number) {
        if(view != null) view.setText(String.valueOf(number));
    }
    @BindingAdapter("android:text")
    public static void setText(TextView view, Date time) {
        if(view != null) {
            if (time == null) view.setText("");
            else view.setText(String.valueOf(time));
        }
    }

    @BindingAdapter("android:visibility")
    public static void setVisibility(View view, Boolean value) {
        if(view != null && value != null) {
            view.setVisibility(value ? View.VISIBLE : View.GONE);
        }
    }

    @BindingAdapter("errorText")
    public static void setErrorText(EditText view, String error) {
        if(view != null) {
            view.setError(error);
        }
    }

    @BindingAdapter("stringList")
    public static void loadDataToListView(ListView view, List<String> data) {
        if(view != null) {
            if (view.getAdapter() != null && view.getAdapter() instanceof ArrayAdapter) {
                ArrayAdapter<String> adapter = (ArrayAdapter<String>) view.getAdapter();
                if (data == null) data = new ArrayList<String>();
                adapter.addAll(data);
                adapter.notifyDataSetChanged();
            }
        }
    }
}