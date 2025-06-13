package com.crist.builder;

import com.crist.builder.model.Car;
import com.crist.builder.model.Usuario;

public class Main {
  public static void main(String[] args) {
    Usuario usuario1 =
        new Usuario.Builder("Carlos", "Perez")
            .email("carlos@example.com")
            .telefono("123456789")
            .edad(30)
            .build();

    Usuario usuario2 = new Usuario.Builder("Ana", "Gomez").email("ana@correo.com").build();

    System.out.println(usuario1);
    System.out.println(usuario2);

    Car car1 = Car.builder().color("Rojo").build();

    System.out.println(car1);
  }
}
