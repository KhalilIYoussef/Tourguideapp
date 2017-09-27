package khaliliyoussef.tourguideapp.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import khaliliyoussef.tourguideapp.R;
import khaliliyoussef.tourguideapp.model.Location;

/**
 * Created by Khalil on 9/26/2017.
 */
public class LocationAdapter extends RecyclerView.Adapter<LocationAdapter.LocationViewHolder> {

    private static List<Location> locations;

    private static Context context;


    public static class LocationViewHolder extends RecyclerView.ViewHolder {
      TextView mName;
      TextView mAddress;
      TextView mHours;
      TextView mPhoneNumber;
      TextView mDescription;
      ImageView mImageId ;

        public LocationViewHolder(View v) {
            super(v);
            mName = (TextView) v.findViewById(R.id.location_text);
            mAddress = (TextView) v.findViewById(R.id.location_name);
           mHours = (TextView) v.findViewById(R.id.hours_text);
            mPhoneNumber = (TextView) v.findViewById(R.id.phone_text);
            mImageId = (ImageView) v.findViewById(R.id.photo);
            mDescription = (TextView) v.findViewById(R.id.description_text);

        }
    }

    public LocationAdapter(Context context, List<Location> locations) {
        this.locations = locations;
        this.context = context;
    }

    @Override
    public LocationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new LocationViewHolder(view);
    }


    @Override
    public void onBindViewHolder(LocationViewHolder holder, final int position) {

        holder.mDescription.setText(locations.get(position).getDescription());
        holder.mPhoneNumber.setText(String.valueOf(locations.get(position).getPhoneNumber()));
        holder.mHours.setText(String.valueOf(locations.get(position).getLocationHours()));
        holder.mName.setText(locations.get(position).getLocationName());
        holder.mAddress.setText(locations.get(position).getLocationAddress());
        holder.mImageId.setImageResource(locations.get(position).getImageResourceId());

    }
    @Override
    public int getItemCount() {
        return locations.size();
    }
}