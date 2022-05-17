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


    ActivityResultLauncher<Intent> activityResult =
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {

                    //procesasr los datos
                    if (result.getResultCode() == Activity.RESULT_OK)
                    {
                        //obtener los datos regresados
                        Bundle datos = result.getData().getExtras();
                        lstDatosRecibidos = datos.getStringArray("lstDatos");
                        buttonMostrar.setEnabled(true);
                    }
                }
            });


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



    public  void  clicSegundoActivity (View view) {

        Intent intent = new Intent(this,SegundoActivity.class);
        activityResult.launch(intent);
    }

    public  void  mostrarDatos (View view){

        String nombres = lstDatosRecibidos[0].toString();
        String apellidos = lstDatosRecibidos[1].toString();
        String base = lstDatosRecibidos[2].toString();
        String exponente = lstDatosRecibidos[3].toString();
        int numero =  Integer.valueOf(lstDatosRecibidos[4].toString());

        double pote = potencia(Double.valueOf(base), Double.valueOf(exponente));

        editTextNombres.setText(nombres);
        editTextApellidos.setText(apellidos);
        editTextBase.setText(base);
        editTextExponente.setText(exponente);
        editTextFactorial.setText(String.valueOf(factorial(numero)));
        editTextPotencia.setText(String.valueOf(pote));
    }

    public static int factorial( int numero ) {
        int fact = 1;
        for( int i = 1; i <= numero; i++ ) {
            fact *= i;
        }

        return fact;

    }

    public  static  double potencia (double a, double b) {
        double resultado = 1;

        while (b != 0) {
            resultado = resultado * a;
            b--;
        }
        return  resultado;
    }



}