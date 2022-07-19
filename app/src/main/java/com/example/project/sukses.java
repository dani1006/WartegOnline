package com.example.project;

import static com.example.project.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.project.Activity.MainActivity;

public class sukses extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sukses);
        back();
    }
    private void back(){
        Button awltBtn = findViewById(id.awlBtn);
        awltBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(sukses.this, MainActivity.class));
            }
        });
    }

}