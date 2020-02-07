package com.example.hellotoast2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hellotoast2.R;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    Button count;
    Button zero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        count = findViewById(R.id.button_count);
        zero = findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }


    public static final String EXTRA_MESSAGE =
            "com.example.android.HelloToast2.extra.MESSAGE";

    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
        zero.setBackgroundColor(Color.RED);
        if(mCount%2 == 0)
            count.setBackgroundColor(Color.CYAN);
        else
            count.setBackgroundColor(Color.GREEN);
    }

    public void showZero(View view) {
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(0));
        zero.setBackgroundColor(Color.GRAY);
    }

    public void launchsecondactivity(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
        String message = "Hello!";
        intent.putExtra(EXTRA_MESSAGE, message);

    }
}