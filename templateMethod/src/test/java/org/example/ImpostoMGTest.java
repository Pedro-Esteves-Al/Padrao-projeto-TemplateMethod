package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImpostoMGTest {

    @Test
    void deveRetornarAliquotaCorreta(){
        ImpostoMG imposto = new ImpostoMG();
        imposto.setArrecadacao1(5.0f);
        imposto.setArrecadacao2(5.0f);
        assertEquals(2.0f,imposto.calculaAliquota());
    }
    @Test
    void deveRetornarEstadoCorreto() {
        ImpostoMG imposto = new ImpostoMG();
        assertEquals("MG",imposto.getEstado());
    }
}