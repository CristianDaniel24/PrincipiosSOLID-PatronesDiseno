package com.crist.abstractFactory.service.impl;

import com.crist.abstractFactory.service.Button;

public class WindowsButtonImpl implements Button {
  @Override
  public void paint() {
    System.out.println("You have created WindowsButton.");
  }
}
