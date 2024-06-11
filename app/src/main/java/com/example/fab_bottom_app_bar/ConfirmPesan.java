package com.example.fab_bottom_app_bar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfirmPesan extends AppCompatActivity {

    private Button sukses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_pesan);

        Button btnsukses = (Button) findViewById(R.id.SuksesBook);

        btnsukses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfirmPesan.this, successbooking.class);
                startActivity(intent);
            }
        });
    }

}