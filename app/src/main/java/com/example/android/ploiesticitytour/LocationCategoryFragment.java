package com.example.android.ploiesticitytour;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LocationCategoryFragment extends Fragment {
    ListView locationsListView;

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
        locationsListView = rootView.findViewById(R.id.listview_id);

        ArrayList<Location> locationsList;
        int categoryType = getArguments().getInt("categoryType");
        switch (categoryType) {
            case 1:
                locationsList = Utils.getHotels(getContext());
                break;
            case 2:
                locationsList = Utils.getRestaurants(getContext());
                break;
            case 3:
                locationsList = Utils.getMuseums(getContext());
                break;
            default:
                locationsList = Utils.getNearBy(getContext());
                break;
        }
        MyListArrayAdapter hotelsListAdapter = new MyListArrayAdapter(getActivity(), locationsList);
        locationsListView.setAdapter(hotelsListAdapter);
        return rootView;
    }

}
