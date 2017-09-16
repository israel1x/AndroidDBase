package com.example.usuario.dbaseterapia.presentadores;

import com.example.usuario.dbaseterapia.adapters.ObservacionTerapiaAdaptador;
import com.example.usuario.dbaseterapia.clases.ObservacionTerapia;

import java.util.ArrayList;

/**
 * Created by Usuario on 14/9/2017.
 */

public interface IRecyclerBitacora {

    public void generarLinearLayoutVertical();

    public ObservacionTerapiaAdaptador crearAdaptadorObservacionTerapia(ArrayList<ObservacionTerapia> observacionTerapias);

    public void inicializarAdaptadorRV(ObservacionTerapiaAdaptador observacionTerapiaAdaptador);

}
