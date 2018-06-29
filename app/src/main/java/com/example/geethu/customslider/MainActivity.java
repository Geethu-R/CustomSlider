package com.example.geethu.customslider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Slidr slidr = findViewById(R.id.slideure);
        slidr.setMin(200);
        slidr.setCurrentValue(500);
        slidr.setListener(new Slidr.Listener() {
            @Override
            public void valueChanged(Slidr slidr, float currentValue) {

            }
        });
    }
}
