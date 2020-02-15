package com.example.tpmpertemuan2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnKirim;
    EditText etNama;
    private ActionBar actionbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionbar = getSupportActionBar();
        actionbar.setTitle("Hello");


        etNama = findViewById(R.id.et_nama);
        btnKirim = findViewById(R.id.btn_kirim);
        btnKirim.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),OutputActivity.class);
                String nama = etNama.getText().toString();
                intent.putExtra("id_nama",nama);
                startActivity(intent);



            }


         }

        );

    }
}
