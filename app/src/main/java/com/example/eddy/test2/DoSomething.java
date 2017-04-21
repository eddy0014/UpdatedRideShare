package com.example.eddy.test2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

/**
 * Created by e-sal on 4/12/2017.
 */

public class DoSomething extends Activity {

    public void changeText() {
        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.activity_main, null);
        TextView newText = (TextView) view.findViewById(R.id.text);
        newText.setText("helllooo");
    }

}
