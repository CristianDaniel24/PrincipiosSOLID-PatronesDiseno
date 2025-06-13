package com.crist.builder.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Car {

  private final String color;

  private final String placa;

  private final Integer puertas;

  @Override
  public String toString() {
    return "Car{"
        + "color='"
        + color
        + '\''
        + ", placa='"
        + placa
        + '\''
        + ", puertas="
        + puertas
        + '}';
  }
}
