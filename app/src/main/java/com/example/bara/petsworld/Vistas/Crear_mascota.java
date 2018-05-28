package com.example.bara.petsworld.Vistas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.bara.petsworld.R;

import java.util.ArrayList;

public class Crear_mascota extends AppCompatActivity {
    private EditText txtApodo,txtEdad;
    private Spinner spn_Animal,spn_Sexo;
    private ArrayAdapter<String>adp_animal,adp_sexo;
    private String [] opc_animal,opc_sexo;
    private ArrayList<Integer> imagenes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_mascota);

        txtApodo = findViewById(R.id.txtApodo);
        txtEdad = findViewById(R.id.txtEdad);

        spn_Animal = findViewById(R.id.spn_Animal);
        opc_animal = this.getResources().getStringArray(R.array.animales);
        adp_animal = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opc_animal);

        spn_Sexo = findViewById(R.id.spn_Animal);
        opc_sexo = this.getResources().getStringArray(R.array.sexo);
        adp_sexo = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,opc_sexo);

        

    }
}
