package com.crist.abstractFactory.service.implMenu;

import com.crist.abstractFactory.service.Menu;

public class MenuMacImpl implements Menu {
  @Override
  public void mostrar() {
    System.out.println("Mostrando menu estilo Mac");
  }
}
