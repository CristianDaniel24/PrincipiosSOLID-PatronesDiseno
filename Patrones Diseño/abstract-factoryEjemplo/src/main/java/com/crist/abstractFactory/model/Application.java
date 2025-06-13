package com.crist.abstractFactory.model;

import com.crist.abstractFactory.service.Button;
import com.crist.abstractFactory.service.Checkbox;
import com.crist.abstractFactory.service.GUIFactory;

public class Application {
  private Button button;
  private Checkbox checkbox;

  public Application(GUIFactory factory) {
    button = factory.createButton();
    checkbox = factory.createCheckbox();
  }

  public void paint() {
    button.paint();
    checkbox.paint();
  }
}
