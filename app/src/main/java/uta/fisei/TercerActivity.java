package uta.fisei;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class TercerActivity extends AppCompatActivity {

    EditText editTextNombres, editTextBase , editTextApellidos, editTextExponente , editTextNumeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercer);

        editTextNombres = findViewById(R.id.editTextTextMostrarNombresTercer);
        editTextBase = findViewById(R.id.editTextTextMostrarBaseTercer);
        editTextApellidos = findViewById(R.id.editTextTextApellidosTercer);
        editTextExponente = findViewById(R.id.editTextTextExponenteTercer);
        editTextNumeros =  findViewById(R.id.editTextTextNumero);

    }



}