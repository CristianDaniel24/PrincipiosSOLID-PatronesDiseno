package com.crist.abstractFactory;

import com.crist.abstractFactory.model.Application;
import com.crist.abstractFactory.service.GUIFactory;
import com.crist.abstractFactory.service.impl.MacOSFactoryImpl;
import com.crist.abstractFactory.service.impl.WindowsFactoryImpl;

public class Main {

  public static void main(String[] args) {
    Application app = configureApplication();
    app.paint();
  }

  private static Application configureApplication() {
    Application app;
    GUIFactory factory;
    String osName = System.getProperty("os.name").toLowerCase();
    if (osName.contains("mac")) {
      factory = new MacOSFactoryImpl();
    } else {
      factory = new WindowsFactoryImpl();
    }
    app = new Application(factory);
    return app;
  }
}
