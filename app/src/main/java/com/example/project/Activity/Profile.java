package com.example.project.Activity;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.project.R;
import com.example.project.Setting;
import com.google.android.material.snackbar.Snackbar;

import org.w3c.dom.Text;

public class Profile extends AppCompatActivity {
    TextView gantiUsername;
    TextView gantiAlamat;
    TextView gantiTelepon;
    EditText Ed1;
    EditText Ed2;
    EditText Ed3;
    private Context mContext;
    private CoordinatorLayout coordinatorLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mContext = getApplicationContext();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        gantiUsername = (TextView) findViewById(R.id.btnUbah);
        Ed1 = (EditText) findViewById(R.id.edtGantinama);
        Ed2 = (EditText) findViewById(R.id.edtGantiAlmt);
        Ed3 = (EditText) findViewById(R.id.edtGantiTelp);
        ImageView backBtn = findViewById(R.id.backBtn);
        TextView namauser = findViewById(R.id.namauser);

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, MainActivity.class ));
            }
        });

        gantiUsername.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ed1.setEnabled(true);
                Ed1.setHint("");
            }
        });

        Ed1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int i, KeyEvent event) {
                String input = Ed1.getText().toString();
                namauser.setText(input);
                Ed1.setEnabled(false);
//                if(i == EditorInfo.IME_ACTION_DONE){
//                    InputMethodManager imm =(InputMethodManager)
//                            getSystemService(Context.INPUT_METHOD_SERVICE);
//
//                    imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),0);
////                    Snackbar.make(
////                            coordinatorLayout,"nama sudah",Snackbar.LENGTH_LONG
////
////                    ).show();
////                    Snackbar snackbar = Snackbar.make(
////                            coordinatorLayout,"Nama berhasil diubah",Snackbar.LENGTH_SHORT);
////                    snackbar.show();
//                    return true;
//                }
                return false;
            }
        });

        gantiAlamat = (TextView) findViewById(R.id.btnUbahAlmt);
        gantiAlamat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Ed2.setEnabled(true);
                Ed2.setHint("");
            }
        });
        Ed2.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int i, KeyEvent event) {
//                String input = Ed1.getText().toString();
//                namauser.setText(input);
                Ed2.setEnabled(false);
                if(i == EditorInfo.IME_ACTION_DONE){
                    InputMethodManager imm =(InputMethodManager)
                            getSystemService(Context.INPUT_METHOD_SERVICE);
                }
                return false;
            }
        });


        gantiTelepon = (TextView) findViewById(R.id.btnUbahTelp);
        gantiTelepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Ed3.setEnabled(true);
                Ed3.setHint("");
            }
        });
        Ed3.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int i, KeyEvent event) {
//                String input = Ed1.getText().toString();
//                namauser.setText(input);
                Ed3.setEnabled(false);
                if(i == EditorInfo.IME_ACTION_DONE){
                    InputMethodManager imm =(InputMethodManager)
                            getSystemService(Context.INPUT_METHOD_SERVICE);

                }
                return false;
            }
        });

    }
}

