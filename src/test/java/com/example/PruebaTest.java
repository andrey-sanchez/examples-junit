package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class PruebaTest {
  // clase a probar
  private Prueba prueba;

  // colaborador mockeado, se puede mockear con la anotación o llamando a Mockito.mock()
  @Mock Colaborador colaborador;

  @Before
  public void setUp() throws Exception {
    // esto es para que mockito inyecte el colaborador
    MockitoAnnotations.initMocks(this);

    this.prueba = new Prueba(colaborador);

    // otra manera de mockear
    // this.colaborador = Mockito.mock(Colaborador.class);
  }

  // este es un test, se hacen tantos como cosas se quieran probar
  @Test
  public void suma() {
    // se llama al método a probar
    int result = this.prueba.suma(3, 5);

    // se valida la respuesta
    Assert.assertEquals(8, result);
  }

  // este test debería fallar con una excepción.
  @Test(expected = NullPointerException.class)
  public void sumaDeberíaFallar() {
    this.prueba.suma(null, null);
  }

  // en este test mockeo la respuesta del colaborador
  @Test
  public void sumaConColaborador() {

    // mockeo el metodo suma del colaborador, retorno cualquier cosa
    Mockito.when(this.colaborador.suma(2, 3)).thenReturn(20);

    int result = this.prueba.sumaConColaborador(2, 3);

    // 2+3=20? =O
    Assert.assertEquals(20, result);
  }
}
