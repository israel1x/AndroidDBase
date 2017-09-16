package com.example.usuario.dbaseterapia;

import android.content.ContentValues;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ViewUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.usuario.dbaseterapia.clases.ObservacionTerapia;
import com.example.usuario.dbaseterapia.db.BaseDeDatosPT;
import com.example.usuario.dbaseterapia.db.ConstantesDataBasePT;
import com.example.usuario.dbaseterapia.db.ConstructorObservacionTerapia;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText edtId, edtName, edtEdad, edtHora, edtTerapiaId, edtComentario, edtHoraComent, edtEstado;
    String  name, edad, hora, comentario, horaComentario, estado;
    int id,idTerapia;

    ConstructorObservacionTerapia constructorObservacionTerapia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtId = (EditText) findViewById(R.id.etvID);
        edtName = (EditText) findViewById(R.id.etvName);
        edtEdad = (EditText) findViewById(R.id.etvEdad);
        edtHora = (EditText) findViewById(R.id.etvHora);
        edtTerapiaId = (EditText) findViewById(R.id.etvTerapia);
        edtComentario = (EditText) findViewById(R.id.etvComentario);
        edtHoraComent = (EditText) findViewById(R.id.etvComentarioHora);
        edtEstado = (EditText) findViewById(R.id.etvEstado);



        BaseDeDatosPT db = new BaseDeDatosPT(getApplicationContext());
        constructorObservacionTerapia = new ConstructorObservacionTerapia(getApplicationContext());
        constructorObservacionTerapia.insertaPacientesPruebas(db);
        constructorObservacionTerapia.insertarObservacionTerapiaspruebas(db);
        ArrayList <ObservacionTerapia> data = db.obtenerTodasLasObservacionesDeLaTerapia();
        Log.d("datos",data.toString());





    }


    public void lanzarbitacora(View view){
        Intent i = new Intent(this, BitacoraTerapia.class);
        startActivity(i);
    }

    public  void obtenerDataAndSave(View view){
       // id = Integer.parseInt(edtId.getText().toString());
        //name = edtName.getText().toString();
        //edad = edtEdad.getText().toString();
        //hora = edtHora.getText().toString();
        idTerapia = Integer.parseInt(edtTerapiaId.getText().toString());
        comentario = edtComentario.getText().toString();
        horaComentario = edtHoraComent.getText().toString();
        //estado = edtEstado.getText().toString();

        //esto deveria ir en el adaotador en el viewholder y al elemento le seteo un onclink y agrego los
        //metodos de guardar comentario
        ConstructorObservacionTerapia constructorObservacionTerapia = new ConstructorObservacionTerapia(getApplication());
        constructorObservacionTerapia.insertarNuevoComentarioByIdTerapia(idTerapia,horaComentario,comentario);

        edtTerapiaId.setText(" ");
        edtComentario.setText(" ");
        edtHoraComent.setText(" ");

    }


}
