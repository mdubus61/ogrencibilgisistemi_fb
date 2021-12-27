package com.md.obs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SilActivity extends AppCompatActivity {

    private EditText editTextSilinecekNo;
    private Button btnSil;

    private String ogrenciNoTXT;

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sil);

        editTextSilinecekNo = (EditText) findViewById(R.id.editTextSilinecekOgrenciNo);

        btnSil = (Button)findViewById(R.id.buttonOgrenciSil);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        btnSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ogrenciNoTXT = editTextSilinecekNo.getText().toString();

                mDatabase.child("Ogrenciler").child(ogrenciNoTXT).removeValue();
                Toast.makeText(SilActivity.this, "Silindi", Toast.LENGTH_SHORT).show();
            }
        });

    }

 }