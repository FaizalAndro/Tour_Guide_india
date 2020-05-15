package com.faizal.tourguide.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.faizal.tourguide.R;
import com.faizal.tourguide.adapters.PlacesAdapter;
import com.faizal.tourguide.models.PlacesModel;

import java.util.ArrayList;


public class Places extends Fragment {

    public Places() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_places, container, false);

        ArrayList<PlacesModel> arrayList = new ArrayList<PlacesModel>();
        arrayList.add(new PlacesModel(getString(R.string.kashmir), getString(R.string.kashmir_desc), R.drawable.kashmir));
        arrayList.add(new PlacesModel(getString(R.string.leh), getString(R.string.leh_desc), R.drawable.ladakh));
        arrayList.add(new PlacesModel(getString(R.string.delhi), getString(R.string.delhi_desc), R.drawable.delhi));
        arrayList.add(new PlacesModel(getString(R.string.agra), getString(R.string.agra_desc), R.drawable.agra));
        arrayList.add(new PlacesModel(getString(R.string.jaisalmer), getString(R.string.jaisalmer_desc), R.drawable.jaisalmer));
        arrayList.add(new PlacesModel(getString(R.string.rann), getString(R.string.rann_desc), R.drawable.kutch));
        arrayList.add(new PlacesModel(getString(R.string.aurangabad), getString(R.string.aurangabad_desc), R.drawable.aurangabad));
        arrayList.add(new PlacesModel(getString(R.string.sundarban), getString(R.string.sundarban_desc), R.drawable.sundaerban));
        arrayList.add(new PlacesModel(getString(R.string.sikkim), getString(R.string.sikkim_desc), R.drawable.sikkin));
        arrayList.add(new PlacesModel(getString(R.string.meghalaya), getString(R.string.meghalaya_desc), R.drawable.meghalaya));
        arrayList.add(new PlacesModel(getString(R.string.kerala), getString(R.string.kerala_desc), R.drawable.kerala));
        arrayList.add(new PlacesModel(getString(R.string.hampi), getString(R.string.hampi_descrip), R.drawable.hampi));
        arrayList.add(new PlacesModel(getString(R.string.mysore), getString(R.string.mysore_desc), R.drawable.mysore));
        arrayList.add(new PlacesModel(getString(R.string.adaman), getString(R.string.adaman_desc), R.drawable.andaman));

        PlacesAdapter adapter = new PlacesAdapter(getActivity(), arrayList);

        ListView listView = view.findViewById(R.id.places_list);
        listView.setAdapter(adapter);

        return view;

    }
}
