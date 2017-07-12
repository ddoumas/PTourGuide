package com.doumas.ptourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;



import java.util.ArrayList;


public class ChurchesFragment extends Fragment {


    public ChurchesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_attractions_list, container, false);


        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.nik, R.string.nik_description, R.drawable.nik));
        attractions.add(new Attraction(R.string.trinity, R.string.trinity_description, R.drawable.trinity));
        attractions.add(new Attraction(R.string.dion, R.string.dion_description, R.drawable.dion));



        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_churches);


        ListView listView = (ListView) rootView.findViewById(R.id.list);


        listView.setAdapter(adapter);

        return rootView;
    }
}


