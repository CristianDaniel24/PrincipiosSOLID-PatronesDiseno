package com.crist.proxy.service.impl;

import com.crist.proxy.service.Documento;

public class ProxyDocumento implements Documento {
  private DocumentoReal documentoReal;
  private String usuario;

  public ProxyDocumento(String usuario) {
    this.usuario = usuario;
  }

  @Override
  public void mostrarContenido() {
    if ("admin".equals(usuario)) {
      if (documentoReal == null) {
        documentoReal = new DocumentoReal("Contenido Secreto 🕵️‍♂️");
      }
      documentoReal.mostrarContenido();
    } else {
      System.out.println("Acceso denegado. Solo los administradores pueden ver el documento.");
    }
  }
}
