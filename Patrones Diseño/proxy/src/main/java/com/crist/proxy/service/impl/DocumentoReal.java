package com.crist.proxy.service.impl;

import com.crist.proxy.service.Documento;

public class DocumentoReal implements Documento {
  private final String contenido;

  public DocumentoReal(String contenido) {
    this.contenido = contenido;
  }

  @Override
  public void mostrarContenido() {
    System.out.println("Mostrando documento: " + contenido);
  }
}
