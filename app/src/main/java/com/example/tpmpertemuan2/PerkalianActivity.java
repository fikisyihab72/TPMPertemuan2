package com.example.tpmpertemuan2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PerkalianActivity extends AppCompatActivity {
    EditText etAngka1, etAngka2;
    TextView tvHasil;
    Double a1,a2,hasil;
    ActionBar actionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perkalian);

        actionbar = getSupportActionBar();
        actionbar.setTitle("Kalkulator");


        etAngka1 = findViewById(R.id.et_angka1);
        etAngka2 = findViewById(R.id.et_angka2);
        tvHasil = findViewById(R.id.tv_hasil);

    }
    public void konvert(){
        a1=Double.parseDouble(etAngka1.getText().toString());
        a2=Double.parseDouble(etAngka2.getText().toString());

    }
    public void prosestambah(View view){
    konvert();
    hasil = a1+a2;
    tvHasil.setText(Double.toString(hasil));

    }
    public void proseskurang(View view){
        konvert();
        hasil = a1-a2;
        tvHasil.setText(Double.toString(hasil));

    }
    public void proseskali(View view){
        konvert();
        hasil = a1*a2;
        tvHasil.setText(Double.toString(hasil));

    }
    public void prosesbagi(View view){
        konvert();
        hasil = a1/a2;
        tvHasil.setText(Double.toString(hasil));

    }
}
