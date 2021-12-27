package com.md.obs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class GuncelleActivity extends AppCompatActivity {

    private EditText editTxtGuncellenecekNo, editTxtGuncellenecekIsim, editTxtGuncellenecekBolum, editTxtGuncellenecekSoyIsim;
    private Button btnGuncelleme;
    private DatabaseReference mDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guncelle);

        editTxtGuncellenecekIsim = (EditText) findViewById(R.id.editTextGuncellenecekIsim);
        editTxtGuncellenecekSoyIsim = (EditText) findViewById(R.id.editTextGuncellenecekSoyIsim);
        editTxtGuncellenecekBolum = (EditText) findViewById(R.id.editTextGuncellenecekBolum);
        editTxtGuncellenecekNo = (EditText) findViewById(R.id.editTextGuncellenecekNo);
        btnGuncelleme = (Button)findViewById(R.id.buttonGuncellemeKaydet);
        mDatabase = FirebaseDatabase.getInstance().getReference("Ogrenciler");

        btnGuncelleme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String isimTXT = editTxtGuncellenecekIsim.getText().toString();
                String soyIsimTXT = editTxtGuncellenecekSoyIsim.getText().toString();
                String ogrenciNoTXT = editTxtGuncellenecekNo.getText().toString();
                String bolumTXT = editTxtGuncellenecekBolum.getText().toString();

                mDatabase.child(ogrenciNoTXT).child("ogrenciAdi").setValue(isimTXT);
                mDatabase.child(ogrenciNoTXT).child("ogrenciSoyadi").setValue(soyIsimTXT);
                mDatabase.child(ogrenciNoTXT).child("bolumAdi").setValue(bolumTXT);

                Toast.makeText(GuncelleActivity.this, "Güncellendi", Toast.LENGTH_SHORT).show();
                editTxtGuncellenecekBolum.setText("");
                editTxtGuncellenecekIsim.setText("");
                editTxtGuncellenecekSoyIsim.setText("");
                editTxtGuncellenecekNo.setText("");
            }
        });


        }
    }


