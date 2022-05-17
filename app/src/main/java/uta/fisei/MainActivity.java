package uta.fisei;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    String[] lstDatosRecibidos;
    Button buttonMostrar ;
    EditText editTextNombres, editTextApellidos, editTextBase, editTextExponente, editTextFactorial, editTextPotencia;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMostrar = findViewById(R.id.buttonMostrarResultados);
        editTextNombres = findViewById(R.id.editTextTextMostrarNombres);
        editTextApellidos = findViewById(R.id.editTextTextApellidos);
        editTextBase  = findViewById(R.id.editTextTextMostrarBase);
        editTextExponente = findViewById(R.id.editTextTextExponente);
        editTextFactorial = findViewById(R.id.editTextTextFactorial);
        editTextPotencia = findViewById(R.id.editTextTextMostrarPotencia);
    }


}