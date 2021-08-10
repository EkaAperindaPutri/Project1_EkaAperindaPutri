package com.ekaaverinda.project1_ekaaperindaputri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Deklarasikan Variabel
    EditText TextNama;
    TextView Hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Panggil Variabel berdasarkan id
        TextNama=(EditText)findViewById(R.id.name);
        Hasil=(TextView)findViewById(R.id.btn_name);
    }

    //buat method tampil nama sesuai dengan property Onclick pada button
    public void TampilNama(View v) {
        Hasil.setText("Nama Anda: "+TextNama.getText());
    }
}