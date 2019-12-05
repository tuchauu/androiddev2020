package vn.edu.usth.weather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;

public class WeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        ForecastFragment firstfragmen=new ForecastFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container,firstfragmen).commit();

        HomeFragmentPagerAdapter adapter = new HomeFragmentPagerAdapter(getSupportFragmentManager());
        ViewPager viewPager= findViewById(R.id.view_pager);
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);






    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("123","onstart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("456", "onstop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("789", "ondestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("789", "onpause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("890", "onresume");
    }


}
