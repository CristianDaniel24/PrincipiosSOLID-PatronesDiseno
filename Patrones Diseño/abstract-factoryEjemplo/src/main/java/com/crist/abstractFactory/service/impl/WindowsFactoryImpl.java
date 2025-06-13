package com.crist.abstractFactory.service.impl;

import com.crist.abstractFactory.service.Button;
import com.crist.abstractFactory.service.Checkbox;
import com.crist.abstractFactory.service.GUIFactory;

public class WindowsFactoryImpl implements GUIFactory {
  @Override
  public Button createButton() {
    return new WindowsButtonImpl();
  }

  @Override
  public Checkbox createCheckbox() {
    return new WindowsCheckboxImpl();
  }
}
