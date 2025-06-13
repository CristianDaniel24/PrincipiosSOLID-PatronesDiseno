package com.crist.abstractFactory.service.impl;

import com.crist.abstractFactory.service.Checkbox;

public class MacOSCheckboxImpl implements Checkbox {
  @Override
  public void paint() {
    System.out.println("You have created MacOSCheckbox.");
  }
}
