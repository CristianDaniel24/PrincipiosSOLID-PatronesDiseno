package com.crist.observer;

import com.crist.observer.service.impl.CanalNoticias;
import com.crist.observer.service.impl.Usuario;

public class Main {
  public static void main(String[] args) {
    CanalNoticias canal = new CanalNoticias();

    Usuario u1 = new Usuario("Ana");
    Usuario u2 = new Usuario("Luis");

    canal.agregarObserver(u1);
    canal.agregarObserver(u2);

    canal.nuevaNoticia("¡Nuevo presidente electo!");
    canal.nuevaNoticia("Terremoto sacude la costa este.");
  }
}
