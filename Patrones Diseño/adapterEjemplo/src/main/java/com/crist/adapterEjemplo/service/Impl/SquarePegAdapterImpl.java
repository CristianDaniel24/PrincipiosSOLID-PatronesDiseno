package com.crist.adapterEjemplo.service.Impl;

import com.crist.adapterEjemplo.service.RoundPeg;
import com.crist.adapterEjemplo.service.SquarePeg;

public class SquarePegAdapterImpl extends RoundPeg {
  private final SquarePeg peg;

  public SquarePegAdapterImpl(SquarePeg peg) {
    this.peg = peg;
  }

  @Override
  public double getRadius() {
    double result;
    // Calculate a minimum circle radius, which can fit this peg.
    result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    return result;
  }
}
