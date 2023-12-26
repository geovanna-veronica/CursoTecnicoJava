package com.mycompany.atividade04;

public class Pagamentos implements CalculoInterface{
    
    String tipo;
    
    float debitoPIS;
    float creditoPIS;
    
    float aliquotaIPI;
    float valoraTotIPI;
    float despesasIPI;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getDebitoPIS() {
        return debitoPIS;
    }

    public void setDebitoPIS(float debitoPIS) {
        this.debitoPIS = debitoPIS;
    }

    public float getCreditoPIS() {
        return creditoPIS;
    }

    public void setCreditoPIS(float creditoPIS) {
        this.creditoPIS = creditoPIS;
    }

    public float getAliquotaIPI() {
        return aliquotaIPI;
    }

    public void setAliquotaIPI(float aliquotaIPI) {
        this.aliquotaIPI = aliquotaIPI;
    }

    public float getValorTotIPI() {
        return valoraTotIPI;
    }

    public void setValorTotIPI(float valoraTotIPI) {
        this.valoraTotIPI = valoraTotIPI;
    }

    public float getDespesasIPI() {
        return despesasIPI;
    }

    public void setDespesasIPI(float despesasIPI) {
        this.despesasIPI = despesasIPI;
    }

    @Override
    public float PIS(float debitoPIS, float creditoPIS) {
        float totalPIS = (float) ((debitoPIS - creditoPIS) * (1.65 / 100));
        return totalPIS;
    }

    @Override
    public float IPI(float aliquotaIPI, float valorTotIPI, float despesasIPI) {
        float totalIPI = (float) ((valorTotIPI + despesasIPI) * (aliquotaIPI / 100));
        return totalIPI;
    }
    
    public void exibir() {
        if ("PIS".equals(getTipo())) {
            System.out.println(" \n");
            System.out.println("Imposto de Programa de Integração Social (PIS)");
            System.out.println("Total Débito: R$" + getDebitoPIS());
            System.out.println("Total Crédito: R$" + getCreditoPIS());
            System.out.println("Total PIS: R$" + PIS(getDebitoPIS(), getCreditoPIS()));
            
            
        } else {
            System.out.println(" \n");
            System.out.println("Imposto sobre Produtos Industrializados (IPI)");
            System.out.println("Valor total dos produtos: R$" + getValorTotIPI());
            System.out.println("Valores adicionais: R$" + getDespesasIPI());
            System.out.println("Alíquota informada: " + getAliquotaIPI() + "%");
            System.out.println("Total IPI: R$" + IPI(getAliquotaIPI(), getValorTotIPI(), getDespesasIPI()));
            System.out.println(" \n");
        }
    }
    
}


