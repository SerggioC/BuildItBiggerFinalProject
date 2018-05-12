package com.udacity.gradle.builditbigger;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {}

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        rootView.findViewById(R.id.tellJokeButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EndpointsAsyncTask task = new EndpointsAsyncTask(rootView.getContext());
                task.execute();
            }
        });

        return rootView;
    }



}
