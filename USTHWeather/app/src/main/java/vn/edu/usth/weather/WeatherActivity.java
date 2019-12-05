package vn.edu.usth.weather;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;
import android.os.PersistableBundle;

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
