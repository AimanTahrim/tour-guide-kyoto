package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A {@link Fragment} subclass that displays a list of shopping places.
 */
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<Place> places = new ArrayList<Place>();

        // Add to an array new objects with the data
        places.add(new Place(getString(R.string.aeon_kyoto), getString(R.string.aeon_kyoto_description), R.drawable.aeon_kyoto));
        places.add(new Place(getString(R.string.daimaru_kyoto), getString(R.string.daimaru_kyoto_description), R.drawable.daimaru_kyoto));
        places.add(new Place(getString(R.string.kyoto_marui), getString(R.string.kyoto_marui_description), R.drawable.kyoto_marui));
        places.add(new Place(getString(R.string.kyoto_porta), getString(R.string.kyoto_porta_description), R.drawable.kyoto_porta));
        places.add(new Place(getString(R.string.takashimaya_kyoto), getString(R.string.takashimaya_kyoto_description), R.drawable.takashimaya_kyoto));

        // Inflate current View object in places_list.xml
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        // Create PlaceAdapter object in current activity for data from places array
        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        // Create ListView object in places_list.xml and set the PlaceAdapter object to it
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        // Return current View object with the data
        return rootView;
    }
}
