package com.example.bhavya.farmersfriend;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.bhavya.farmersfriend.R;

/**
 * Created by bhavya on 12/11/17.
 */

public class HomeFragment extends Fragment {

    View Home;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Home = inflater.inflate(R.layout.home, container, false);
        return Home;
    }
}
