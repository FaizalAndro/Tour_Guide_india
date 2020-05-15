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
public class Food extends Fragment {

    public Food() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_food, container, false);

        ArrayList<CommonModels> arrayList = new ArrayList<>();
        arrayList.add(new CommonModels(getString(R.string.butter_chicken), getString(R.string.butter_chicken_desc)));
        arrayList.add(new CommonModels(getString(R.string.samosa), getString(R.string.samosa_desf)));
        arrayList.add(new CommonModels(getString(R.string.aalo), getString(R.string.aalo_desc)));
        arrayList.add(new CommonModels(getString(R.string.naan), getString(R.string.naan_desc)));
        arrayList.add(new CommonModels(getString(R.string.matar), getString(R.string.matar_desc)));
        arrayList.add(new CommonModels(getString(R.string.rogan), getString(R.string.rogan_desc)));
        arrayList.add(new CommonModels(getString(R.string.tandoori), getString(R.string.tandoori_desc)));
        arrayList.add(new CommonModels(getString(R.string.curry), getString(R.string.curry_desc)));
        arrayList.add(new CommonModels(getString(R.string.chutney), getString(R.string.chatni_desc)));

        CommonAdapter adapter = new CommonAdapter(getActivity(), arrayList);
        ListView listView = view.findViewById(R.id.food_list);

        listView.setAdapter(adapter);

        return view;
    }
}
