package com.example.clase06;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtCliente, txtdni;
    private RadioButton rbtDuo, rbtTrio,rbtCamaras, rbtaRobos, rbtaIncendio, rbtcercos;
    private Button btncalcular,btnimprimir;
    private RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtCliente = findViewById(R.id.edtcliente);
        txtdni = findViewById(R.id.edtdni);

        rbtDuo = findViewById(R.id.rbtnduo);
        rbtTrio = findViewById(R.id.rbtntrio);
        rbtCamaras = findViewById(R.id.rbtncamaras);
        rbtaRobos = findViewById(R.id.rbtnArobos);
        rbtaIncendio = findViewById(R.id.rbtnAincendio);
        rbtcercos = findViewById(R.id.rbtnCercos);

        radioGroup=findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton radioButton = findViewById(i);
                if(rbtDuo.getId()==radioButton.getId()){
                    Toast.makeText(getApplication(),""+radioButton.getText().toString(),Toast.LENGTH_LONG).show();

                }
                else if ((rbtTrio.getId()==radioButton.getId())){

                }
            }
        });

        btncalcular = findViewById(R.id.btnCalcular);
        btnimprimir = findViewById(R.id.btnImprimir);
        btncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnimprimir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplication(),ImprimirActivity.class);
                intent.putExtra("Cliente", txtCliente.getText().toString());
                startActivity(intent);

            }
        });
    }
}