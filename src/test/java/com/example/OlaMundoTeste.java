package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OlaMundoTeste {
  @Test
  public void testMensagem() {
    OlaMundo ola = new OlaMundo();
    assertEquals("Hello, World!", ola.mensagem());
  }
}

