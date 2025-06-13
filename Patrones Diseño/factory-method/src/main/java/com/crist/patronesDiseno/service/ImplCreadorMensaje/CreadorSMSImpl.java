package com.crist.patronesDiseno.service.ImplCreadorMensaje;

import com.crist.patronesDiseno.service.CreadorMensaje;
import com.crist.patronesDiseno.service.Mensaje;
import com.crist.patronesDiseno.service.implMensaje.MensajeSMSImpl;

public class CreadorSMSImpl extends CreadorMensaje {
  @Override
  public Mensaje crearMensaje() {
    return new MensajeSMSImpl();
  }
}
