package com.example.android.ploiesticitytour;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by nibos on 3/8/2018.
 */

public class MyListArrayAdapter extends ArrayAdapter<Location> {
    public MyListArrayAdapter(@NonNull Context context, @NonNull List <Location> lista) {
        super(context, 0, lista);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View rootView=convertView;
        if (rootView==null)
            rootView= LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent,false);
        ImageView imageView=rootView.findViewById(R.id.iv_list_item);
        TextView title=rootView.findViewById(R.id.tv_list_item_poi_name);
        TextView schedule=rootView.findViewById(R.id.tv_list_item_poi_schedule);
        TextView phone=rootView.findViewById(R.id.tv_list_item_poi_phone);
        TextView address=rootView.findViewById(R.id.tv_list_item_poi_address);
        Location currentLocation=getItem(position);
        if(currentLocation.getImageResourceId()!=0)  {
            imageView.setImageResource(currentLocation.getImageResourceId());
        }
        title.setText(currentLocation.getName());
        schedule.setText(currentLocation.getBussinessHours());
        phone.setText(currentLocation.getPhone());
        address.setText(currentLocation.getLocation());
        return rootView;
    }
}
