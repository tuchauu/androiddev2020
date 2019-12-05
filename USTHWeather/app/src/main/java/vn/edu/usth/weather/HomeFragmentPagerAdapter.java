
package vn.edu.usth.weather;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class HomeFragmentPagerAdapter extends FragmentPagerAdapter {
    private final  int PAGE_COUNT = 3;
    private String[] titles = new String[]{"Hanoi", "Ho Chi Minh", "Hai Phong"};

    protected HomeFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int page) {
        // returns an instance of Fragment corresponding to the specified page
        switch (page) {
            case 0:  WeatherandForecastFragment wff = new WeatherandForecastFragment();
            return wff;

            case 1:  WeatherandForecastFragment wff1 = new WeatherandForecastFragment();
            return  wff1;

            case 2: WeatherandForecastFragment wff2 = new WeatherandForecastFragment();
            return wff2;

        }
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}