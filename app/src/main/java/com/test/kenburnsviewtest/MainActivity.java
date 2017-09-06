package com.test.kenburnsviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.flaviofaria.kenburnsview.KenBurnsView;
import com.flaviofaria.kenburnsview.Transition;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KenBurnsView kbv = (KenBurnsView) findViewById(R.id.image);
        kbv.setTransitionListener(new KenBurnsView.TransitionListener() {
            @Override
            public void onTransitionStart(Transition transition) {

            }
            @Override
            public void onTransitionEnd(Transition transition) {

            }
        });
    }
}
