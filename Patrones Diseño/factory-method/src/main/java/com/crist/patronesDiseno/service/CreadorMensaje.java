package com.crist.patronesDiseno.service;

public abstract class CreadorMensaje {
  public abstract Mensaje crearMensaje(); // metodo factory

  public void enviarMensaje(String contenido) {
    Mensaje mensaje = crearMensaje(); // se usa el factory
    mensaje.enviar(contenido);
  }
}
