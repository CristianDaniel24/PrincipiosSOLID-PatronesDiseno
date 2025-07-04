package com.crist.adapter;

import com.crist.adapter.service.CargadorEuropeo;
import com.crist.adapter.service.CargadorUSB;
import com.crist.adapter.service.Dispositivo;
import com.crist.adapter.service.Impl.AdaptadorEuropeoUSBImpl;

public class Main {
    public static void main(String[] args){
        // Objeto incompatible
        CargadorEuropeo europeo = new CargadorEuropeo();

        // Adaptador convierte a interfaz compatible
        CargadorUSB adaptador = new AdaptadorEuropeoUSBImpl(europeo);

        // El cliente solo conoce la interfaz CargadorUSB
        Dispositivo telefono = new Dispositivo(adaptador);
        telefono.iniciarCarga();
    }
}
