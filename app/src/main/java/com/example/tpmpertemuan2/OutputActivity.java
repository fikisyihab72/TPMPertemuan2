package com.example.tpmpertemuan2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {
    TextView etOutput;
    ActionBar actionbar;
    Button btnPerkalian;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        actionbar = getSupportActionBar();
        actionbar.setTitle("Hello");


        String nama = getIntent().getStringExtra("id_nama");
        String nama2 = "Hi "+nama+"!";
        etOutput = findViewById(R.id.et_output);
        etOutput.setText(nama2);

        btnPerkalian=findViewById(R.id.btn_perkalian);
        btnPerkalian.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(),PerkalianActivity.class);
            startActivity(intent);


        }
        }


        );
    }
}
