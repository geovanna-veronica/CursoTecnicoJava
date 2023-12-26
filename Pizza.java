package com.mycompany.pizzaria;

public class Pizza {
    String nome;
    int tamanho;
    float precoPizza;
    String sabor;
    String ingrediente1;
    String ingrediente2;
    
    public Pizza() {
        
    }
    
    public Pizza(String nome, int tamanho, float preco, String sabor, String ingrediente1, String ingrediente2) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.precoPizza = preco;
        this.sabor = sabor;
        this.ingrediente1 = ingrediente1;
        this.ingrediente2 = ingrediente2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public float getPrecoPizza() {
        return precoPizza;
    }

    public void setPrecoPizza(float preco) {
        this.precoPizza = preco;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(String ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public String getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(String ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }
    
    public void exibirPizza() {
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nome da pizza: " + getNome());
        System.out.println("Tamanho da pizza em cm: " + getTamanho());
        System.out.println("Preço: R$" + getPrecoPizza());
        System.out.println("Sabor: " + getSabor());
        System.out.println("Ingredientes: " + getIngrediente1() + " e "+ getIngrediente2());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" \n");
    }
    
    
}
