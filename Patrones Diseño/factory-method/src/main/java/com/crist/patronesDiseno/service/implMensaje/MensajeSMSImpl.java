package com.crist.patronesDiseno.service.implMensaje;

import com.crist.patronesDiseno.service.Mensaje;

public class MensajeSMSImpl implements Mensaje {
  @Override
  public void enviar(String contenido) {
    System.out.println("Enviando SMS: " + contenido);
  }
}
