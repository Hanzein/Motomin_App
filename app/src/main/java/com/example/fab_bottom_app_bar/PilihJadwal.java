package com.example.fab_bottom_app_bar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PilihJadwal extends AppCompatActivity {
    private Button servis2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_jadwal);

      Button lanjutServis2 = (Button) findViewById(R.id.servis2_next);
      lanjutServis2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent = new Intent(PilihJadwal.this, PesanServis2.class);
              startActivity(intent);
          }
      });
    }

}