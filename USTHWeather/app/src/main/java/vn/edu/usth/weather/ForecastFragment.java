package vn.edu.usth.weather;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ForecastFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ForecastFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,@NonNull ViewGroup container,
                             @NonNull Bundle savedInstanceState) {
    View view = inflater.inflate(R.layout.fragment_forecast,container,false);
        LinearLayout vertical_layout= view.findViewById(R.id.vertical_layout);


    View v=new View(getContext());
    v.setBackgroundColor(0x2000FF00);
    return v;
    }
}
