package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpostoESTest {
    @Test
    void deveRetornarAliquotaCorreta(){
        ImpostoES imposto = new ImpostoES();
        imposto.setArrecadacao1(5.0f);
        imposto.setArrecadacao2(5.0f);
        assertEquals(3.3000002f,imposto.calculaAliquota());
    }
    @Test
    void deveRetornarEstadoCorreto() {
        ImpostoES imposto = new ImpostoES();
        assertEquals("ES",imposto.getEstado());
    }
}