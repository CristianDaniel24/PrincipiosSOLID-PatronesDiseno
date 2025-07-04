package com.crist.proxy;

import com.crist.proxy.service.Documento;
import com.crist.proxy.service.impl.ProxyDocumento;

public class Main {
  public static void main(String[] args) {
    Documento doc1 = new ProxyDocumento("admin");
    doc1.mostrarContenido(); // Mostrara el contenido

    Documento doc2 = new ProxyDocumento("invitado");
    doc2.mostrarContenido(); // Acceso denegado
  }
}
