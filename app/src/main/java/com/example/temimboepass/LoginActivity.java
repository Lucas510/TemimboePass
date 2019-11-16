package com.example.temimboepass;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

import datos.Estudiante;


public class LoginActivity extends Activity {

    private static final String TAG = "LoginActivity";

    EditText editTextEstudiante;
    EditText editTextPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: Inicia la creacion de la actividad");
        setContentView(R.layout.activity_login);

        editTextEstudiante = (EditText) findViewById(R.id.nombre_estudiante);
        editTextPassword = (EditText) findViewById(R.id.contrasenha);

    }
        public void validarEstudiantePassword (View boton) {
            String nombreEstudiante = editTextEstudiante.getText().toString();
            String password = editTextPassword.getText().toString();

            Log.i(TAG, "Nombre de estudiante: " + nombreEstudiante);
            Log.i(TAG, "Password: " + password);
            //Lista de estudiantes en el cual, se obtiene un estudiante de estudiantes
            ArrayList<Estudiante> listaEstudiantes = Estudiante.getEstudiantes();

            //Con un for recorremos la lista de estudiantes
            for (int i = 0; i < listaEstudiantes.size(); i++) {
                Estudiante unEstudiante = listaEstudiantes.get(i);
                Log.i(TAG, "nombreEstudiante: " + unEstudiante.getMail());
                Log.i(TAG, "Password: " + unEstudiante.getPassword());

                //Condicional, si son correctos los datos se loguea
                if (nombreEstudiante.equals(unEstudiante.getMail())) {
                    if (password.equals(unEstudiante.getPassword())) {
                        Log.i(TAG, "Estudiante logueado");

                        Intent intentMenuDesplegable = new Intent(this, MenuDesplegable.class);
                        startActivity(intentMenuDesplegable);

                        //Si no son correctos le saldra un mensaje
                    } else {
                        Log.i(TAG, "Password invalido");
                    }
                } else {
                    Log.i(TAG, "Estudiante invalido");
                }
            }

        }

}
