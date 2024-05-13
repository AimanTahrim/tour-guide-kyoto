package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A {@link Fragment} subclass that displays a list of cultural places.
 */
public class MonumentsFragment extends Fragment {


    public MonumentsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Create an array of places
        ArrayList<Place> places = new ArrayList<Place>();

        // Add to an array new objects with the data
        places.add(new Place(getString(R.string.nijo_castle), getString(R.string.nijo_castle_descripton), R.drawable.nijo_castle));
        places.add(new Place(getString(R.string.daitoku_ji), getString(R.string.daitoku_ji_description), R.drawable.daitoku_ji));
        places.add(new Place(getString(R.string.fushimi_inari_taisha), getString(R.string.fushimi_inari_taisha_description), R.drawable.fushimi_inari_taisha));
        places.add(new Place(getString(R.string.kinkaku_ji), getString(R.string.kinkaku_ji_description), R.drawable.kinkaku_ji));
        places.add(new Place(getString(R.string.kyoto_imperial_palace), getString(R.string.kyoto_imperial_palace_description), R.drawable.kyoto_imperial_palace));

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
