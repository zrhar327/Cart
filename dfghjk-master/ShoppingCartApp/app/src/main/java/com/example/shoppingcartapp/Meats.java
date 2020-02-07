package com.example.shoppingcartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Meats extends AppCompatActivity {

    Intent toCart;
    Intent main;

    int numBeef = 0;
    int numChicken = 0;
    int numFish = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cereal);
        toCart = new Intent(this, Shopping_Cart.class);
        main = new Intent(this, MainActivity.class);
    }


    public void cheerioisOnClick(View view) {
        numBeef++;

    }

    public void DynoBytesOnClick(View view) {
        numChicken++;

    }

    public void CaptainCrunchOnClick(View view) {
        numFish++;

    }

    public void onClick(View view) {
        startActivity(main);
        toCart.putExtra("Beef", numBeef);
        main.putExtra("Beef", numBeef);
        toCart.putExtra("Chicken", numChicken);
        main.putExtra("Chicken", numChicken);
        toCart.putExtra("Fish", numFish);
        main.putExtra("Fish", numFish);
    }

    public void onClick2(View view) {
        startActivity(toCart);
        toCart.putExtra("Beef", numBeef);
        main.putExtra("Beef", numBeef);
        toCart.putExtra("Chicken", numChicken);
        main.putExtra("Chicken", numChicken);
        toCart.putExtra("Fish", numFish);
        main.putExtra("Fish", numFish);
    }
}
