package com.crist.singleton.Model;

import lombok.Data;

@Data
public class ConfiguracionApp {
  private static ConfiguracionApp instancia;
  private String idioma;
  private boolean modoOscuro;

  private ConfiguracionApp() {
    // valores por defecto
    this.idioma = "español";
    this.modoOscuro = false;
  }

  public static ConfiguracionApp getInstancia() {
    if (instancia == null) {
      instancia = new ConfiguracionApp();
    }
    return instancia;
  }
}
