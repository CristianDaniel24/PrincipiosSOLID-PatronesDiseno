package com.crist.abstractFactory;

import com.crist.abstractFactory.model.Aplicacion;
import com.crist.abstractFactory.service.UIFactory;
import com.crist.abstractFactory.service.implUIFactory.MacUIFactoryImpl;
import com.crist.abstractFactory.service.implUIFactory.WindowsUIFactoryImpl;

public class Main {
  public static void main(String[] args) {
    UIFactory factory;

    String sistema = "Mac"; // Se puede cambiar a Windows

    if (sistema.equalsIgnoreCase("Windows")) {
      factory = new WindowsUIFactoryImpl();
    } else {
      factory = new MacUIFactoryImpl();
    }

    Aplicacion app = new Aplicacion(factory);
    app.renderizarUI();
  }
}
