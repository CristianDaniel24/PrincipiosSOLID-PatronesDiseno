package com.crist.adapter.service.Impl;

import com.crist.adapter.service.CargadorEuropeo;
import com.crist.adapter.service.CargadorUSB;

public class AdaptadorEuropeoUSBImpl implements CargadorUSB {
  private final CargadorEuropeo cargadorEuropeo;

  public AdaptadorEuropeoUSBImpl(CargadorEuropeo cargadorEuropeo) {
    this.cargadorEuropeo = cargadorEuropeo;
  }

  @Override
  public void cargar() {
    cargadorEuropeo.cargarEnchufeEuropeo();
  }
}
