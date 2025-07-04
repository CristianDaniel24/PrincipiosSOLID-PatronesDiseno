package com.crist.observer.service.impl;

import com.crist.observer.service.Observer;
import com.crist.observer.service.Subject;
import java.util.ArrayList;
import java.util.List;

public class CanalNoticias implements Subject {
  private final List<Observer> suscriptores = new ArrayList<>();

  @Override
  public void agregarObserver(Observer o) {
    suscriptores.add(o);
  }

  @Override
  public void eliminarObserver(Observer o) {
    suscriptores.remove(o);
  }

  @Override
  public void notificarObservers(String noticia) {
    for (Observer o : suscriptores) {
      o.actualizar(noticia);
    }
  }

  public void nuevaNoticia(String noticia) {
    System.out.println("📰 Nueva noticia: " + noticia);
    notificarObservers(noticia);
  }
}
