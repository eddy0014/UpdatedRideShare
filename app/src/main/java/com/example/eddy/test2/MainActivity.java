package com.example.eddy.test2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<RidePosting> ridePostings;
    private ListView listingsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listingsView = (ListView) findViewById(R.id.listingsList);
    }

    @Override
    protected void onResume() {
        super.onResume();

        String method = "getListings";
        BackgroundTask backgroundTask = new BackgroundTask(this);
        backgroundTask.execute(method);
        Toast.makeText(this, "Retrieving listings...", Toast.LENGTH_LONG).show();
    }

    public void doAction(View view) {
        Intent i = new Intent(MainActivity.this, PostListing.class);
        startActivity(i);
    }

    public void setListingsView(ArrayList<RidePosting> rideListings) {
        RidePostingAdapter adapter = new RidePostingAdapter(this, rideListings);
        listingsView.setAdapter(adapter);
    }
}
