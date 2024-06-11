package com.example.fab_bottom_app_bar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PesanServis extends AppCompatActivity {

    private Button pilihjadwal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_servis);

       Button piljadbtn = (Button) findViewById(R.id.lanjut_servis2);
       piljadbtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(PesanServis.this, PilihJadwal.class);
               startActivity(intent);
           }
       });

    }

}