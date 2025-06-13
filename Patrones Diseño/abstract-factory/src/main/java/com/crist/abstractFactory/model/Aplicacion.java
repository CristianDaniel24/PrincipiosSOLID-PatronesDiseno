package com.crist.abstractFactory.model;

import com.crist.abstractFactory.service.Boton;
import com.crist.abstractFactory.service.Menu;
import com.crist.abstractFactory.service.UIFactory;
import lombok.Data;

@Data
public class Aplicacion {
  private Boton boton;
  private Menu menu;

  public Aplicacion(UIFactory factory) {
    boton = factory.crearBoton();
    menu = factory.crearMenu();
  }

  public void renderizarUI() {
    boton.dibujar();
    menu.mostrar();
  }
}
