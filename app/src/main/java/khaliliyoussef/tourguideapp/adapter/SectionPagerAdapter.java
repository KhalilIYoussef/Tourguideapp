package khaliliyoussef.tourguideapp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import khaliliyoussef.tourguideapp.R;
import khaliliyoussef.tourguideapp.fragment.FitnessFragment;
import khaliliyoussef.tourguideapp.fragment.FoodFragment;
import khaliliyoussef.tourguideapp.fragment.FunFragment;
import khaliliyoussef.tourguideapp.fragment.ParkFragment;

import static android.content.res.Resources.getSystem;

public class SectionPagerAdapter extends FragmentPagerAdapter {

    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ParkFragment();
            case 1:
                return new FoodFragment();
            case 2:
                return new FunFragment();
            default:
                return new FitnessFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Parks";
            case 1:
                return "Food";
            case 2:
                return "Fun";
            default:
                return "Fitness";
        }
    }
}