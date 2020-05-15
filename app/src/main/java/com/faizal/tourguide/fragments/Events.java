package com.faizal.tourguide.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.faizal.tourguide.R;
import com.faizal.tourguide.adapters.CommonAdapter;
import com.faizal.tourguide.models.CommonModels;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Events extends Fragment {

    public Events() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_events, container, false);

        ArrayList<CommonModels> arrayList = new ArrayList<>();
        arrayList.add(new CommonModels(getString(R.string.bachelor), getString(R.string.bachelor_address)));
        arrayList.add(new CommonModels(getString(R.string.pool_party), getString(R.string.pool_address)));
        arrayList.add(new CommonModels(getString(R.string.club_party), getString(R.string.club_event)));
        arrayList.add(new CommonModels(getString(R.string.wine_party), getString(R.string.wine_address)));

        CommonAdapter commonAdapter = new CommonAdapter(getActivity(), arrayList);
        ListView listView = view.findViewById(R.id.eventList);
        listView.setAdapter(commonAdapter);

        return view;
    }
}
