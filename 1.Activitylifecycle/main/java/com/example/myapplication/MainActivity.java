package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "myapplication";
    private static final boolean VERBOSE = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (VERBOSE) Log.v(TAG, "++ ON CREATE ++");
    }

    public void onStart(){
        super.onStart();
        Toast.makeText(getApplicationContext(), "The app has started", Toast.LENGTH_SHORT).show();
        if (VERBOSE) Log.v(TAG, "++ ON START ++");
    }

    public void onResume(){
        super.onResume();
        Toast.makeText(getApplicationContext(), "The app has resumed", Toast.LENGTH_SHORT).show();
        if (VERBOSE) Log.v(TAG, "++ ON RESUME ++");
    }
    public void onPause(){
        super.onPause();
        Toast.makeText(getApplicationContext(), "The app has stopped", Toast.LENGTH_SHORT).show();
        if (VERBOSE) Log.v(TAG, "++ ON PAUSE ++");
    }

    public void onStop(){
        super.onStop();
        Toast.makeText(getApplicationContext(), "The app has stopped", Toast.LENGTH_SHORT).show();
        if (VERBOSE) Log.v(TAG, "++ ON STOP ++");
    }
    public void onRestart(){
        super.onRestart();
        Toast.makeText(getApplicationContext(), "The app has stopped", Toast.LENGTH_SHORT).show();
        if (VERBOSE) Log.v(TAG, "++ ON STOP ++");
    }
    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "The app has stopped", Toast.LENGTH_SHORT).show();
        if (VERBOSE) Log.v(TAG, "++ ON DESTROY ++");
    }
}