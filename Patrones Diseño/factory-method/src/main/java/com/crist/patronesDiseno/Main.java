package com.crist.patronesDiseno;

import com.crist.patronesDiseno.service.CreadorMensaje;
import com.crist.patronesDiseno.service.ImplCreadorMensaje.CreadorEmailImpl;
import com.crist.patronesDiseno.service.ImplCreadorMensaje.CreadorSMSImpl;
import com.crist.patronesDiseno.service.ImplCreadorMensaje.CreadorWhatsAppImpl;

public class Main {
  public static void main(String[] args) {
    CreadorMensaje creador1 = new CreadorWhatsAppImpl();
    creador1.enviarMensaje("Hola por WhatsApp!");

    CreadorMensaje creador2 = new CreadorEmailImpl();
    creador2.enviarMensaje("Hola por Email!");

    CreadorMensaje creador3 = new CreadorSMSImpl();
    creador3.enviarMensaje("Hola por SMS!");
  }
}
