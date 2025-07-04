package com.crist.adapter.service;

public class Dispositivo {
    private final CargadorUSB cargador;

    public Dispositivo(CargadorUSB cargador) {
        this.cargador = cargador;
    }

    public void iniciarCarga() {
        System.out.println("Conectando cargador...");
        cargador.cargar();
    }
}
