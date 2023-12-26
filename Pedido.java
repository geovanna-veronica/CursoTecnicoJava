package com.mycompany.pizzaria;

public class Pedido {
    int mesa;
    Pizza pizza;
    Bebida bebida;
    
    public Pedido() {
        
    }
    
    public Pedido(int mesa, Pizza pizza, Bebida bebida) {
        this.mesa = mesa;
        this.pizza = pizza;
        this.bebida = bebida;
    }

    public int getMesa() {
        return mesa;
    }

    public void setMesa(int mesa) {
        this.mesa = mesa;
    }
    
    public float calcularTotal() {
        float total = pizza.getPrecoPizza() + bebida.getPrecoBebida();
        return total;
    }
    
    public void exibirPedido() {
        System.out.println("=== Pedido na Mesa " + getMesa() + " ===");
        System.out.println("Pizza:");
        pizza.exibirPizza();
        System.out.println("Bebida:");
        bebida.exibirBebida();
        System.out.println("Total: R$" + calcularTotal());
        System.out.println("===========================");
    }
}
