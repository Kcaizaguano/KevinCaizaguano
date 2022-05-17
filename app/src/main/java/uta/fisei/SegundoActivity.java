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

public class SegundoActivity extends AppCompatActivity {


    String[] lstDatosRecibidos;
    Button buttonCerrarS ;



    EditText editTextNombres, editTextBase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        editTextNombres = findViewById(R.id.editTextTextNombres);
        editTextBase = findViewById(R.id.editTextTextBase);
        buttonCerrarS = findViewById(R.id.buttonCerrarSegundo);
    }


}