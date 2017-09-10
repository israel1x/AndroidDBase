package com.example.usuario.dbaseterapia;

import android.content.ContentValues;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.usuario.dbaseterapia.db.BaseDeDatosPT;
import com.example.usuario.dbaseterapia.db.ConstantesDataBasePT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void insertaPacientesPruebas(BaseDeDatosPT db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesDataBasePT.TABLE_PACIENTE_ID,1);
        contentValues.put(ConstantesDataBasePT.TABLE_PACIENTE_NOMBRE,"israel Zurita");
       // contentValues.put(ConstantesDataBasePT);
    }

    public void insertarObservacionTerapiaspruebas(BaseDeDatosPT db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesDataBasePT.TABLE_OBS_TERAPIA_ID, 1);
        contentValues.put(ConstantesDataBasePT.TABLE_OBS_TERAPIA, 1);
       /// contentValues.put(ConstantesDataBasePT.TABLE_O, 1);
        contentValues.put(ConstantesDataBasePT.TABLE_OBS_TERAPIA_ID, 1);
    }

}
