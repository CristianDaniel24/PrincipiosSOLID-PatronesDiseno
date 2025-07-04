package com.crist.observer.service.impl;

import com.crist.observer.service.Observer;

public class Usuario implements Observer {
  private final String nombre;

  public Usuario(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public void actualizar(String noticia) {
    System.out.println(nombre + " recibió la noticia: " + noticia);
  }
}
