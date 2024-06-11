package com.example.fab_bottom_app_bar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PesanServis2 extends AppCompatActivity {

    private Button lanjutdetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan_servis2);

        Button btnLantail = (Button) findViewById(R.id.lanjutDetail);

        btnLantail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PesanServis2.this, ConfirmPesan.class);
                startActivity(intent);
            }
        });
    }

}