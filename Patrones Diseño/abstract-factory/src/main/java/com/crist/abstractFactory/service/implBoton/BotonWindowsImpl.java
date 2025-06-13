package com.crist.abstractFactory.service.implBoton;

import com.crist.abstractFactory.service.Boton;

public class BotonWindowsImpl implements Boton {
  @Override
  public void dibujar() {
    System.out.println("Dibujando boton estilo Windows");
  }
}
