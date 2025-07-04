package com.crist.observer.service;

public interface Subject {
  void agregarObserver(Observer o);

  void eliminarObserver(Observer o);

  void notificarObservers(String noticia);
}
