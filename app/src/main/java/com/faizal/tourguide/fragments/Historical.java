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
import com.faizal.tourguide.models.PlacesModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Historical extends Fragment {

    public Historical() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_historical, container, false);
        ArrayList<CommonModels> arrayList = new ArrayList<>();
        arrayList.add(new CommonModels(getString(R.string.taj), getString(R.string.taj_desc)));
        arrayList.add(new CommonModels(getString(R.string.hampi2), getString(R.string.hampi_desc)));
        arrayList.add(new CommonModels(getString(R.string.fatehpur), getString(R.string.fatehpur_desc)));
        arrayList.add(new CommonModels(getString(R.string.jalliahwala), getString(R.string.jalliahwala_desc)));
        arrayList.add(new CommonModels(getString(R.string.redfort), getString(R.string.redfort_desc)));
        arrayList.add(new CommonModels(getString(R.string.gateway), getString(R.string.gateway_desc)));
        arrayList.add(new CommonModels(getString(R.string.khajurao), getString(R.string.kahjurao_desc)));
        arrayList.add(new CommonModels(getString(R.string.ajanta), getString(R.string.ajanta_desc)));
        arrayList.add(new CommonModels(getString(R.string.konark), getString(R.string.konark_desc)));
        arrayList.add(new CommonModels(getString(R.string.rani), getString(R.string.rani_desc)));

        CommonAdapter commonAdapter = new CommonAdapter(getActivity(), arrayList);
        ListView listView = view.findViewById(R.id.historicList);
        listView.setAdapter(commonAdapter);
        return view;
    }
}
