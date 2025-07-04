package com.crist.facade.facade;

import com.crist.facade.Luces;
import com.crist.facade.Pantalla;
import com.crist.facade.Proyector;
import com.crist.facade.SistemaSonido;

public class CineFacade {
  private final Proyector proyector;
  private final SistemaSonido sonido;
  private final Luces luces;
  private final Pantalla pantalla;

  public CineFacade(Proyector proyector, SistemaSonido sonido, Luces luces, Pantalla pantalla) {
    this.proyector = proyector;
    this.sonido = sonido;
    this.luces = luces;
    this.pantalla = pantalla;
  }

  public void comenzarPelicula() {
    System.out.println("Preparando para ver la película...");
    luces.atenuar();
    pantalla.bajar();
    proyector.encender();
    sonido.encender();
    System.out.println("¡Disfruta la película!");
  }

  public void terminarPelicula() {
    System.out.println("Finalizando película...");
    sonido.apagar();
    proyector.apagar();
    pantalla.subir();
    luces.encender();
  }
}
