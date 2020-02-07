package com.example.saveinstanceactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.BundleCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int i = 0;

    public String instance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }




    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("reply_text",instance);
    }


    public void countUp(View view) {
        i++;
    }
}
