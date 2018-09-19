package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ColaboradorTest {
  private Colaborador colaborador;

  // este metodo se llama antes de cada test
  @Before
  public void setUp() throws Exception {
    this.colaborador = new Colaborador();
  }

  // este es un test, se hacen tantos como cosas se quieran probar
  @Test
  public void suma() {

    // se llama al método a probar
    int result = this.colaborador.suma(2, 3);

    // se valida la respuesta
    Assert.assertEquals(5, result);
  }
}
