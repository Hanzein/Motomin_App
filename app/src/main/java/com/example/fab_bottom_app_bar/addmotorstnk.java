package com.example.fab_bottom_app_bar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class addmotorstnk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmotorstnk);

        ImageView cariStnk = (ImageView) findViewById(R.id.cariMotor);
        cariStnk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addmotorstnk.this, TambahKendaraan.class);
                startActivity(intent);
            }
        });
    }
}