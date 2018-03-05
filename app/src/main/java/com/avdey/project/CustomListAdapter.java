package com.avdey.project;


import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CustomListAdapter extends ArrayAdapter<Rocket> {

    ArrayList<Rocket> rockets;
    Context context;
    int resource;
    public CustomListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Rocket> rockets) {
        super(context, resource, rockets);
        this.context = context;
        this.resource = resource;
        this.rockets = rockets;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.customlayout, null, true);
        }

        Rocket rocket = getItem(position);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        Picasso.with(context).load(rocket.getImage()).into(imageView);


        TextView rocketName = (TextView) convertView.findViewById(R.id.rocketName);
        rocketName.setText(rocket.getName());

        TextView details = (TextView) convertView.findViewById(R.id.details);
        details.setText(rocket.getDetails());

        TextView missonPath = (TextView) convertView.findViewById(R.id.missonPath);
        missonPath.setText(rocket.getMissompath());

        TextView time = (TextView) convertView.findViewById(R.id.time);
        time.setText(rocket.getTime());

        return convertView;
    }
}
