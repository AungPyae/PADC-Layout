package xyz.aungpyaephyo.padc_layout.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.aungpyaephyo.padc_layout.R;

/**
 * Created by aung on 6/19/16.
 */
public class GridLayoutFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_grid_layout, container, false);
        return view;
    }
}
