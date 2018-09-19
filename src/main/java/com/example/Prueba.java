package com.example;

import java.util.Objects;

public class Prueba {

  private final Colaborador colaborador;

  public Prueba(Colaborador colaborador) {
    this.colaborador = colaborador;
  }

  int suma(Integer a, Integer b) {
    Objects.requireNonNull(a);
    Objects.requireNonNull(b);
    return a + b;
  }

  int sumaConColaborador(Integer a, Integer b) {
    Objects.requireNonNull(a);
    Objects.requireNonNull(b);
    return this.colaborador.suma(a, b);
  }
}
