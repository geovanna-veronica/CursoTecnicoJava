package com.mycompany.pizzaria;
import java.util.ArrayList;

public class Cardapio {
    
    ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
    ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
    ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    public void adicionarPizza(Pizza pizza) {
        pizzas.add(pizza);
    }
    
    public void adicionarBebiba(Bebida bebida) {
        bebidas.add(bebida);
    }
    
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    
    public void listarPizza() {
        System.out.println("Pizzas: ");
        for(int i = 0; i < pizzas.size(); i++) {
            System.out.println(i + ". " + pizzas.get(i).getNome());
        }
    }
    
    public void listarBebida() {
        System.out.println("Bebidas: ");
        for(int i = 0; i < bebidas.size(); i ++) {
            System.out.println(i + ". " + bebidas.get(i).getNome());
        }
    }
    
    
    public void listarCardapio() {
        System.out.println(" \n");
        System.out.println("------------- Cardápio da Pizzaria Solamento -------------");
        System.out.println("PIZZAS: ");
        
        for (Pizza pizza : pizzas) {
            pizza.exibirPizza();
        }
        
        System.out.println(" \n");
        System.out.println("BEBIDAS: ");
        for (Bebida bebida : bebidas) {
            bebida.exibirBebida();
        }
    }
    
    public void listarPedido() {
        System.out.println(" \n");
        System.out.println("Pedidos confirmados e aguardando preparo: ");
        
        for (Pedido pedido : pedidos) {
            pedido.exibirPedido();
        }
    }
    
}
