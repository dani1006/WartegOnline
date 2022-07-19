package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.project.Activity.IntroActivity;
import com.example.project.Activity.MainActivity;
import com.example.project.Activity.Profile;

import java.util.Set;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        pindah();
    }
    private void pindah(){
        ImageView clsBtn = findViewById(R.id.clsBtn);
        Button logoutBtn = findViewById(R.id.logoutBtn);
        TextView edtTlp = findViewById(R.id.edtTlp);
        TextView edtLokasi =findViewById(R.id.edtLokasi);

        clsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Setting.this, MainActivity.class));
            }
        });
        logoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Setting.this, IntroActivity.class));
            }
        });
        edtTlp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = "089256349";
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", number, null)));
            }
        });
        edtLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = "089256349";
                startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("map", number, null)));
            }
        });
    }

}