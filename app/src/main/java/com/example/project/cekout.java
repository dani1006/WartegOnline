package com.example.project;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.project.Adapter.CartListAdapter;
import com.example.project.Helper.ManagementCart;
import com.example.project.Interface.ChangeNumberItemsListener;
import com.example.project.R;
import com.example.project.Setting;
import com.example.project.cekout;
import com.example.project.sukses;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class cekout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cekout);

        good();
    }
    private void good(){
        Button cekoutBtn = findViewById(R.id.cekoutBtn);
        cekoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(cekout.this, sukses.class));
            }
        });
    }




}