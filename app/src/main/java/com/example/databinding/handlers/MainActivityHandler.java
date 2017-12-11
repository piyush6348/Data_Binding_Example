package com.example.databinding.handlers;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.R;

/**
 * Created by piyush on 23/12/17.
 */

public class MainActivityHandler {

    public void onClickView(View view){
        if(view.getId() == R.id.btn1){
            // btn1 clicked
            Log.e( "onClick:"," btn1" );
        }
        else if(view.getId() == R.id.btn2){
            // btn2 clicked
            Log.e( "onClick:"," btn2" );
        }
    }

}
