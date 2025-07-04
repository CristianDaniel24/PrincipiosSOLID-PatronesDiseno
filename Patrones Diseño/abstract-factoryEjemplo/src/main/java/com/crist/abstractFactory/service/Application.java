package com.crist.abstractFactory.service;

public class Application {
  private final Button button;
  private final Checkbox checkbox;

  public Application(GUIFactory factory) {
    button = factory.createButton();
    checkbox = factory.createCheckbox();
  }

  public void paint() {
    button.paint();
    checkbox.paint();
  }
}
