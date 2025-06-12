package org.example;

public abstract class Imposto {
    private float arrecadacao1;
    private float arrecadacao2;
//    private float aliquota;

    public float getArrecadacao1() {
        return arrecadacao1;
    }

    public void setArrecadacao1(float arrecadacao1) {
        this.arrecadacao1 = arrecadacao1;
    }

    public float getArrecadacao2() {
        return arrecadacao2;
    }

    public void setArrecadacao2(float arrecadacao2) {
        this.arrecadacao2 = arrecadacao2;
    }

//    public float getAliquota() {
//        return aliquota;
//    }
//
//    public void setAliquota(float aliquota) {
//        this.aliquota = aliquota;
//    }

    public float calculaArrecadamentoTotal() {
        return this.arrecadacao1 + this.arrecadacao2;
    }
    public abstract String getEstado();
    public float calculaAliquota() {
        if (getEstado() == "MG") {
            return calculaArrecadamentoTotal()*0.2f; //20%
        } else if (getEstado() == "RJ") {
            return calculaArrecadamentoTotal()*0.5f;
        } else if (getEstado() == "SP") {
            return calculaArrecadamentoTotal()*0.25f;
        } else {
            return calculaArrecadamentoTotal()*0.33f;
        }
    }

}
