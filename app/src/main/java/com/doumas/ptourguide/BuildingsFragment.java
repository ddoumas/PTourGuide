package com.doumas.ptourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;



import java.util.ArrayList;


public class BuildingsFragment extends Fragment {


    public BuildingsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_attractions_list, container, false);


        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.dimotiko, R.string.dimotiko_description, R.drawable.dimotiko));
        attractions.add(new Attraction(R.string.sef, R.string.sef_description, R.drawable.sef));
        attractions.add(new Attraction(R.string.pyrgos, R.string.pyrgos_description, R.drawable.pyrgos));



        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions , R.color.category_buildings);

        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        return rootView;
    }
}
