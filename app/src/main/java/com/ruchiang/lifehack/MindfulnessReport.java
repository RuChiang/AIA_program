package com.ruchiang.lifehack;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MindfulnessReport extends Fragment {

    private static final String TAG = "HeartbeatFrag";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_report_mindfulness, container, false);
    }

}
