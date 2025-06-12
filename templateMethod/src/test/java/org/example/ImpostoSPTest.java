package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpostoSPTest {

    @Test
    void deveRetornarAliquotaCorreta(){
        ImpostoSP imposto = new ImpostoSP();
        imposto.setArrecadacao1(5.0f);
        imposto.setArrecadacao2(5.0f);
        assertEquals(2.5f,imposto.calculaAliquota());
    }
    @Test
    void deveRetornarEstadoCorreto() {
        ImpostoSP imposto = new ImpostoSP();
        assertEquals("SP",imposto.getEstado());
    }
}