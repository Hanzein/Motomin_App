package com.example.fab_bottom_app_bar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.fab_bottom_app_bar.Fragment.Home;

public class successbooking extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successbooking);


        Button backHome = (Button) findViewById(R.id.btnBack);
        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(successbooking.this, MainActivity.class);
                startActivity(intent);
            }


        });

    }




}