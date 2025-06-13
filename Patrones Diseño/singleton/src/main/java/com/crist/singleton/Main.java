package com.crist.singleton;

import com.crist.singleton.Model.ConfiguracionApp;

public class Main {
  public static void main(String[] args) {
    ConfiguracionApp config1 = ConfiguracionApp.getInstancia();
    config1.setIdioma("ingles");
    config1.setModoOscuro(true);

    ConfiguracionApp config2 = ConfiguracionApp.getInstancia();

    System.out.println("Idioma actual: " + config2.getIdioma()); // ingles
    System.out.println("¿Modo oscuro? " + config2.isModoOscuro()); // true

    // Ambos objetos son el mismo
    System.out.println(config1 == config2); // true
  }
}
