package com.mycompany.pizzaria;

public class Bebida {
    String nome;
    int ml;
    float precoBebida;
    
    public Bebida() {
        
    }
    
    public Bebida(String nome, int ml, float preco) {
        this.nome = nome;
        this.ml = ml;
        this.precoBebida = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    public float getPrecoBebida() {
        return precoBebida;
    }

    public void setPrecoBebida(float preco) {
        this.precoBebida = preco;
    }
    
    public void exibirBebida() {
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nome da bebida: " + getNome());
        System.out.println("Quantidade em ml: " + getMl());
        System.out.println("Preço: R$" + getPrecoBebida());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" \n");
    }
    
}
