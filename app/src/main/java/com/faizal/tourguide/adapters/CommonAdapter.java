package com.faizal.tourguide.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.faizal.tourguide.R;
import com.faizal.tourguide.models.CommonModels;

import java.util.List;

public class CommonAdapter extends ArrayAdapter<CommonModels> {
    public CommonAdapter(@NonNull Context context, @NonNull List<CommonModels> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        CommonModels models = getItem(position);
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_common, parent, false);
        }
        TextView title = convertView.findViewById(R.id.title_textview);
        TextView description = convertView.findViewById(R.id.desc_textview);

        title.setText(models.getTitle());
        description.setText(models.getAbout());

        return convertView;
    }
}
