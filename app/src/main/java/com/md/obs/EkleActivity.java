package com.md.obs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class EkleActivity extends AppCompatActivity {

    private EditText editTxtIsim, editTxtSoyIsim, editTxtOgrenciNo, editTxtBolum;
    private Button btnKaydet;
    private DatabaseReference mDatabase;
    private Ogrenci ogrenci;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekle);

        editTxtIsim = (EditText) findViewById(R.id.editTextIsim);
        editTxtSoyIsim = (EditText) findViewById(R.id.editTextSoyIsim);
        editTxtOgrenciNo = (EditText) findViewById(R.id.editTextOgrenciNo);
        editTxtBolum = (EditText) findViewById(R.id.editTextBolumAdi);

        mDatabase = FirebaseDatabase.getInstance().getReference();

        btnKaydet = (Button)findViewById(R.id.buttonKaydet);

        btnKaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String isimTXT = editTxtIsim.getText().toString();
                String soyIsimTXT = editTxtSoyIsim.getText().toString();
                String ogrenciNoTXT = editTxtOgrenciNo.getText().toString();
                String bolumAdiTXT = editTxtBolum.getText().toString();

                ogrenci= new Ogrenci(isimTXT,soyIsimTXT,ogrenciNoTXT,bolumAdiTXT);
                mDatabase.child("Ogrenciler").child(ogrenciNoTXT).setValue(ogrenci);

                Toast.makeText(EkleActivity.this, "Eklendi", Toast.LENGTH_SHORT).show();
            }
        });


    }

   }