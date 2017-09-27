package khaliliyoussef.tourguideapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import khaliliyoussef.tourguideapp.R;
import khaliliyoussef.tourguideapp.adapter.LocationAdapter;
import khaliliyoussef.tourguideapp.model.Location;

public class FitnessFragment extends Fragment {

    public FitnessFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();


        locations.add(new Location(getString(R.string.crossfit_name),
                getString(R.string.crossfit_address),
                getString(R.string.not_applicable),
                getString(R.string.crossfit_phone),
                getString(R.string.crossfit_description),
                R.mipmap.crossfit));

        locations.add(new Location(getString(R.string.yogasylum_name),
                getString(R.string.yogasylum_address),
                getString(R.string.not_applicable),
                getString(R.string.yogasylum_phone),
                getString(R.string.yogasylum_description),
                R.mipmap.yogasylum));

        locations.add(new Location(getString(R.string.salto_name),
                getString(R.string.salto_address),
                getString(R.string.not_applicable),
                getString(R.string.sakura_phone),
                getString(R.string.salto_description),
                R.mipmap.salto));

        locations.add(new Location(getString(R.string.glacier_drumlin_name),
                getString(R.string.glacier_drumlin_address),
                getString(R.string.not_applicable),
                getString(R.string.glacier_drumlin_phone),
                getString(R.string.glacier_drumlin_description),
                R.mipmap.glacier_drumlin));

        // Find display view for list
        RecyclerView listView = (RecyclerView) rootView.findViewById(R.id.locations_list);

        // Create custom adapter instance and connect to the list view
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
