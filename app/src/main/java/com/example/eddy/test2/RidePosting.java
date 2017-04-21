package com.example.eddy.test2;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by e-sal on 4/21/2017.
 */

public class RidePosting extends AppCompatActivity {

    //Variables for each ride posting
    private int id;
    private String origin;
    private String destination;
    private String departingTime;

    //Empty constructor
    public RidePosting() {
    }

    //Constructor used to instantiate the variables
    public RidePosting(String originVar, String destinationVar, String departingTimeVar) {
        origin = originVar;
        destination = destinationVar;
        departingTime = departingTimeVar;
    }

    //Getters for the variables
    public int getID() {
        return id;
    }
    public String getOrigin() {
        return origin;
    }
    public String getDestination() {
        return destination;
    }
    public String getDepartingTime() {
        return departingTime;
    }

    //Setters for the variables
    public void setID(int id) {this.id = id;}
    public void setOrigin(String origin) {this.origin = origin;}
    public void setDestination(String destination) {this.destination = destination;}
    public void setDepartingTime(String departingTime) {
        this.departingTime = departingTime;
    }
}