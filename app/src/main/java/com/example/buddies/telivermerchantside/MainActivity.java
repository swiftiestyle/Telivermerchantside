package com.example.buddies.telivermerchantside;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.teliver.sdk.core.Teliver;
import com.teliver.sdk.models.TripBuilder;

public class MainActivity extends AppCompatActivity {
Button start,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start= (Button)findViewById(R.id.button2);
        stop= (Button)findViewById(R.id.button);
        Teliver.init(this,"TELIVER_KEY");
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Teliver.startTrip(new TripBuilder("Tracking_Id").build());
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Teliver.stopTrip("Tracking_Id");
            }
        });

    }
}
