package com.crist.abstractFactory.service.implUIFactory;

import com.crist.abstractFactory.service.Boton;
import com.crist.abstractFactory.service.Menu;
import com.crist.abstractFactory.service.UIFactory;
import com.crist.abstractFactory.service.implBoton.BotonMacImpl;
import com.crist.abstractFactory.service.implMenu.MenuMacImpl;

public class MacUIFactoryImpl implements UIFactory {
  @Override
  public Boton crearBoton() {
    return new BotonMacImpl();
  }

  @Override
  public Menu crearMenu() {
    return new MenuMacImpl();
  }
}
