package com.doumas.ptourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;



import java.util.ArrayList;


public class SightsFragment extends Fragment {


    public SightsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_attractions_list, container, false);


        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.kastella, R.string.kastella_description, R.drawable.kastella));
        attractions.add(new Attraction(R.string.mikro, R.string.mikro_description, R.drawable.mikrolimano));
        attractions.add(new Attraction(R.string.zea, R.string.zea_description, R.drawable.zea));


        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_sights);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        return rootView;
    }
}


