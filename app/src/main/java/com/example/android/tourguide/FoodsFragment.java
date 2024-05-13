package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A {@link Fragment} subclass that displays a list of parks.
 */
public class FoodsFragment extends Fragment {


    public FoodsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<Place> places = new ArrayList<Place>();

        // Add to an array new objects with the data
        places.add(new Place(getString(R.string.kaiseki), getString(R.string.kaiseki_description), R.drawable.kaiseki));
        places.add(new Place(getString(R.string.kyoto_style_sushi), getString(R.string.kyoto_style_sushi_description), R.drawable.kyoto_style_sushi));
        places.add(new Place(getString(R.string.nagashi_somen), getString(R.string.nagashi_somen_description), R.drawable.nagashi_somen));
        places.add(new Place(getString(R.string.omurice), getString(R.string.omurice_description), R.drawable.omurice));
        places.add(new Place(getString(R.string.tofu_yuba_yudofu), getString(R.string.tofu_yuba_yudofu_description), R.drawable.tofu_yuba_yudofu));

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
