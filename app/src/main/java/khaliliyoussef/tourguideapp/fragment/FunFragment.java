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

/**
 * Created by Khalil on 9/26/2017.
 */
public class FunFragment extends Fragment {

    public FunFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();

        locations.add(new Location(getString(R.string.adventure_rock_name),
                getString(R.string.adventure_rock_address),
                getString(R.string.not_applicable),
                getString(R.string.adventure_rock_phone),
                getString(R.string.adventure_rock_description),
                R.mipmap.adventure_rock));

        locations.add(new Location(getString(R.string.icombat_name),
                getString(R.string.icombat_address),
                getString(R.string.not_applicable),
                getString(R.string.icombat_phone),
                getString(R.string.icombat_description),
                R.mipmap.icombat));

        locations.add(new Location(getString(R.string.skyzone_name),
                getString(R.string.skyzone_address),
                getString(R.string.not_applicable),
                getString(R.string.skyzone_phone),
                getString(R.string.skyzone_description),
                R.mipmap.skyzone));

        locations.add(new Location(getString(R.string.veloce_name),
                getString(R.string.veloce_address),
                getString(R.string.not_applicable),
                getString(R.string.veloce_phone),
                getString(R.string.veloce_description),
                R.mipmap.veloce_speedway));





        // Find display view for list
        RecyclerView listView = (RecyclerView) rootView.findViewById(R.id.locations_list);

        // Create custom adapter instance and connect to the list view
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
