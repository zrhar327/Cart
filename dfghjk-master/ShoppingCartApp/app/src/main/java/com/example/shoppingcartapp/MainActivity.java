package com.example.shoppingcartapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.text.MeasuredText;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    Bundle b = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent toCart = new Intent(this, Shopping_Cart.class);
        Intent cart = getIntent();
        if (toCart != null) {
            b = cart.getExtras();
        }


    }




    public void onClick(View view) {
        Intent Cereal = new Intent(this, Cereal.class);
        startActivity(Cereal);
    }

    public void onClick2(View view) {
        Intent Medicine = new Intent(this, Medicine.class);
        startActivity(Medicine);
    }

    public void onClick3(View view) {
        Intent Meats = new Intent(this, Meats.class);
        startActivity(Meats);
    }

    public void onClick4(View view) {
        Intent toCart = new Intent(this, Shopping_Cart.class);
        toCart.putExtra("cart contents", b);
        startActivity(toCart);
    }
}
