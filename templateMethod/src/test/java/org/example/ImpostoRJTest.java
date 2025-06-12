package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpostoRJTest {
    @Test
    void deveRetornarAliquotaCorreta(){
        ImpostoRJ imposto = new ImpostoRJ();
        imposto.setArrecadacao1(5.0f);
        imposto.setArrecadacao2(5.0f);
        assertEquals(5.0f,imposto.calculaAliquota());
    }
    @Test
    void deveRetornarEstadoCorreto() {
        ImpostoRJ imposto = new ImpostoRJ();
        assertEquals("RJ",imposto.getEstado());
    }
}