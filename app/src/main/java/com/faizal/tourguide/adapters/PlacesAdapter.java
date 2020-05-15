package com.faizal.tourguide.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.faizal.tourguide.R;
import com.faizal.tourguide.models.PlacesModel;

import java.util.List;

public class PlacesAdapter extends ArrayAdapter<PlacesModel> {
    public PlacesAdapter(@NonNull Context context, @NonNull List<PlacesModel> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        PlacesModel placesModel = getItem(position);
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView placeTitle = convertView.findViewById(R.id.place_title);
        TextView placeDescription = convertView.findViewById(R.id.places_description);
        ImageView placesImage = convertView.findViewById(R.id.places_image);

        placeTitle.setText(placesModel.getPlaces_title());
        placeDescription.setText(placesModel.getPlaces_description());
        Glide.with(convertView.getContext())
                .load(placesModel.getPlaces_images_id())
                .into(placesImage);
        return convertView;
    }
}


