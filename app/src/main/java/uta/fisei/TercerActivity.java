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


    public void cerrar (View view){
        String apellidos = editTextApellidos.getText().toString();
        String exponente = editTextExponente.getText().toString();
        String numero = editTextNumeros.getText().toString();
        String nombres = editTextNombres.getText().toString();
        String base = editTextBase.getText().toString();

        String[] lstDatos = new String[5];
        lstDatos[0]= nombres;
        lstDatos[1]=apellidos;
        lstDatos[2]= base;
        lstDatos[3]=exponente;
        lstDatos[4]=numero;

        Intent intent = new Intent();
        intent.putExtra("lstDatos",lstDatos);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }





}