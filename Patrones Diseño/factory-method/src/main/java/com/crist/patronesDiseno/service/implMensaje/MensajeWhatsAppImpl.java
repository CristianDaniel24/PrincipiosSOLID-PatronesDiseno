package com.crist.patronesDiseno.service.implMensaje;

import com.crist.patronesDiseno.service.Mensaje;

public class MensajeWhatsAppImpl implements Mensaje {
  @Override
  public void enviar(String contenido) {
    System.out.println("Enviando WhatsApp: " + contenido);
  }
}
