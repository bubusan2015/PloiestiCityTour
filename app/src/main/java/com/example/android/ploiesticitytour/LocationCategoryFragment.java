package com.example.android.ploiesticitytour;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class LocationCategoryFragment extends Fragment {
    ListView listView;

    public LocationCategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_location_list, container, false);
        listView = rootView.findViewById(R.id.listview_id);

        ArrayList<Location> list;
        int categoryType = getArguments().getInt("categoryType");
        switch (categoryType) {
            case 1:
                list = Utils.getHotels();
                break;
            case 2:
                list = Utils.getRestaurants();
                break;
            case 3:
                list = Utils.getMuseums();
                break;
            default:
                list = Utils.getNearBy();
                break;
        }
        MyListArrayAdapter hotelsListAdapter = new MyListArrayAdapter(getActivity(), list);
        listView.setAdapter(hotelsListAdapter);
        return rootView;
    }

}
