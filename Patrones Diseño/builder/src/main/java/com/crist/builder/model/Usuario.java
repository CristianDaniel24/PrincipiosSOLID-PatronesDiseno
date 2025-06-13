package com.crist.builder.model;

import lombok.Data;

@Data
public class Usuario {
  // Campos requeridos
  private final String nombre;
  private final String apellido;

  // Campos opcionales
  private final String email;
  private final String telefono;
  private final int edad;

  // Constructor privado
  private Usuario(Builder builder) {
    this.nombre = builder.nombre;
    this.apellido = builder.apellido;
    this.email = builder.email;
    this.telefono = builder.telefono;
    this.edad = builder.edad;
  }

  // Metodo toString para mostrar los datos
  @Override
  public String toString() {
    return nombre
        + " "
        + apellido
        + " | Email: "
        + email
        + " | Tel: "
        + telefono
        + " | Edad: "
        + edad;
  }

  // Clase estatica interna Builder
  public static class Builder {
    private final String nombre;
    private final String apellido;

    private String email = "";
    private String telefono = "";
    private int edad = 0;

    public Builder(String nombre, String apellido) {
      this.nombre = nombre;
      this.apellido = apellido;
    }

    public Builder email(String email) {
      this.email = email;
      return this;
    }

    public Builder telefono(String telefono) {
      this.telefono = telefono;
      return this;
    }

    public Builder edad(int edad) {
      this.edad = edad;
      return this;
    }

    public Usuario build() {
      return new Usuario(this);
    }
  }
}
