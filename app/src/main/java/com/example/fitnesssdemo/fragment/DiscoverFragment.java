package com.example.fitnesssdemo.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

import com.example.fitnesssdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DiscoverFragment extends Fragment {
    ViewFlipper viewFlipper;
    ImageButton btnPre, btnNext;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discover, container, false);
        viewFlipper = (ViewFlipper) view.findViewById(R.id.viewFlipper);
        btnPre = (ImageButton) view.findViewById(R.id.btn_pre);
        btnNext = (ImageButton) view.findViewById(R.id.btn_next);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.setAutoStart(true);
        btnNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (viewFlipper.isAutoStart()){
                    viewFlipper.stopFlipping();
                    viewFlipper.showNext();
                    viewFlipper.startFlipping();
                    viewFlipper.setAutoStart(true);
                }
            }
        });
        btnPre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (viewFlipper.isAutoStart()) {
                    viewFlipper.stopFlipping();
                    viewFlipper.showPrevious();
                    viewFlipper.startFlipping();
                    viewFlipper.setAutoStart(true);
                }

            }
        });

        return view;
    }

}
