package com.crist.abstractFactory.service.implUIFactory;

import com.crist.abstractFactory.service.Boton;
import com.crist.abstractFactory.service.Menu;
import com.crist.abstractFactory.service.UIFactory;
import com.crist.abstractFactory.service.implBoton.BotonWindowsImpl;
import com.crist.abstractFactory.service.implMenu.MenuWindowsImpl;

public class WindowsUIFactoryImpl implements UIFactory {
  @Override
  public Boton crearBoton() {
    return new BotonWindowsImpl();
  }

  @Override
  public Menu crearMenu() {
    return new MenuWindowsImpl();
  }
}
