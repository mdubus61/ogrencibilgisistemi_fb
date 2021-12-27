package com.md.obs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnEkle, btnSil, btnGuncelle, btnListele;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnEkle = (Button) findViewById(R.id.buttonEkle);
        btnSil = (Button) findViewById(R.id.buttonSil);
        btnGuncelle = (Button) findViewById(R.id.buttonGüncelle);
        btnListele = (Button) findViewById(R.id.buttonListele);

    }

    public void islemSecimi(View v){
        switch (v.getId()){

            case R.id.buttonEkle:
                intent = new Intent(MainActivity.this,EkleActivity.class);
                startActivity(intent);
                break;

            case R.id.buttonSil:
                intent = new Intent (MainActivity.this,SilActivity.class);
                startActivity(intent);
                break;

            case R.id.buttonGüncelle:
                intent = new Intent(MainActivity.this,GuncelleActivity.class);
                startActivity(intent);
                break;

            case R.id.buttonListele:
                intent = new Intent(MainActivity.this,ListeleActivity.class);
                startActivity(intent);
                break;
        }
    }

}