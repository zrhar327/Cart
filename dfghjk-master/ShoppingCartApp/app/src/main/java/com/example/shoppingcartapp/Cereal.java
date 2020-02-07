package com.example.shoppingcartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class Cereal extends AppCompatActivity {


    int numCheerios = 0;
    int numBytes = 0;
    int numCrunch = 0;
    Intent main;
    Intent toCart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cereal);
        main = new Intent(this, MainActivity.class);
        toCart = new Intent(this, Shopping_Cart.class);

    }


    public void cheerioisOnClick(View view) {
        numCheerios++;
    }

    public void DynoBytesOnClick(View view) {
        numBytes++;
    }

    public void CaptainCrunchOnClick(View view) {
        numCrunch++;
    }

    public void onClick(View view) {
        startActivity(main);
        toCart.putExtra("Cheerios", numCheerios);
        main.putExtra("Cheerios", numCheerios);
        toCart.putExtra("Fruity Dyno Bytes", numBytes);
        main.putExtra("Fruity Dyno Bytes", numBytes);
        toCart.putExtra("Captain Crunch", numCrunch);
        main.putExtra("Captain Crunch", numCrunch);
    }

    public void onClick2(View view) {
        startActivity(toCart);
        toCart.putExtra("Cheerios", numCheerios);
        main.putExtra("Cheerios", numCheerios);
        toCart.putExtra("Fruity Dyno Bytes", numBytes);
        main.putExtra("Fruity Dyno Bytes", numBytes);
        toCart.putExtra("Captain Crunch", numCrunch);
        main.putExtra("Captain Crunch", numCrunch);
    }
}
