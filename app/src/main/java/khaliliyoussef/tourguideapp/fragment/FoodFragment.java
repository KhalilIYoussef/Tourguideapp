package khaliliyoussef.tourguideapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import khaliliyoussef.tourguideapp.R;
import khaliliyoussef.tourguideapp.adapter.LocationAdapter;
import khaliliyoussef.tourguideapp.model.Location;
/**
 * Created by Khalil on 9/26/2017.
 */
public class FoodFragment extends Fragment {

    public FoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();




        locations.add(new Location(getString(R.string.golosi_name),
                getString(R.string.golosi_address),
                getString(R.string.not_applicable),
                getString(R.string.golosi_phone),
                getString(R.string.golosi_description),
                R.mipmap.golosi_cafe));

        locations.add(new Location(getString(R.string.peoples_park_name),
                getString(R.string.peoples_park_address),
                getString(R.string.not_applicable),
                getString(R.string.peoples_park_phone),
                getString(R.string.peoples_park_description),
                R.mipmap.peoples_park));

        locations.add(new Location(getString(R.string.jimmys_name),
                getString(R.string.jimmys_address),
                getString(R.string.not_applicable),
                getString(R.string.jimmys_phone),
                getString(R.string.jimmys_description),
                R.mipmap.jimmys_grotto));

        locations.add(new Location(getString(R.string.michaels_name),
                getString(R.string.michaels_address),
                getString(R.string.not_applicable),
                getString(R.string.michaels_phone),
                getString(R.string.michaels_description),
                R.mipmap.michaels_italian));
        // Find display view for list
        ListView listView = (ListView) rootView.findViewById(R.id.locations_list);

        // Create custom adapter instance and connect to the list view
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), locations);
        listView.setAdapter(locationAdapter);

        return rootView;
    }
}
