package com.doumas.ptourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;



import java.util.ArrayList;


public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_attractions_list, container, false);


        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.amof, R.string.amof_description, R.drawable.amof));
        attractions.add(new Attraction(R.string.hmmp, R.string.hmmp_decription, R.drawable.pap));



        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_museums);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        return rootView;
    }
}





