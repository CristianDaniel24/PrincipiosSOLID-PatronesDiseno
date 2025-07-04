package com.crist.facade;

import com.crist.facade.facade.CineFacade;

public class Main {
  public static void main(String[] args) {
    // Creamos los componentes
    Proyector proyector = new Proyector();
    SistemaSonido sonido = new SistemaSonido();
    Luces luces = new Luces();
    Pantalla pantalla = new Pantalla();

    // Creamos la fachada
    CineFacade cine = new CineFacade(proyector, sonido, luces, pantalla);

    // El cliente solo interactúa con la fachada
    cine.comenzarPelicula();
    System.out.println("---");
    cine.terminarPelicula();
  }
}
