package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A {@link Fragment} subclass that displays a list of monuments.
 */
public class FestivalsFragment extends Fragment {


    public FestivalsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<Place> places = new ArrayList<Place>();

        // Add to an array new objects with the data
        places.add(new Place(getString(R.string.kyoto_cherry_blossom_festival), getString(R.string.kyoto_cherry_blossom_festival_description), R.drawable.kyoto_cherry_blossom_festival));
        places.add(new Place(getString(R.string.kyoto_light_festival), getString(R.string.kyoto_light_festival_description), R.drawable.kyoto_light_festival));
        places.add(new Place(getString(R.string.kyoto_aoi_matsuri), getString(R.string.kyoto_aoi_matsuri_description), R.drawable.kyoto_aoi_festival));
        places.add(new Place(getString(R.string.kyoto_gion_matsuri), getString(R.string.kyoto_gion_matsuri_description), R.drawable.kyoto_gion_matsuri));
        places.add(new Place(getString(R.string.kyoto_jidai_matsuri),getString(R.string.kyoto_jidai_matsuri_description), R.drawable.kyoto_jidai_festival));


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
