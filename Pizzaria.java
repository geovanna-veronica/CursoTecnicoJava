package com.mycompany.pizzaria;

import java.util.Scanner;

public class Pizzaria {

    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();
        
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        
       do {
           System.out.println(" \n");
           System.out.println("------------MENU------------");
           System.out.println("1 - Cadastrar nova pizza;");
           System.out.println("2 - Cadastrar nova bebida;");
           System.out.println("3 - Listar Cardapio;");
           System.out.println("4 - Criar pedido e mostrar dados do pedido;");
           System.out.println("5 - Próximo pedido a ser preparado e levado ao cliente.;");
           System.out.println("6 - Sair;");
           System.out.print("Escolha uma das opções: ");
           System.out.println(" \n");
           
           opcao = teclado.nextInt();
           switch(opcao) {
               case 1:
                   Pizza pizza = new Pizza();
                   System.out.print("Insira o nome da pizza: ");
                   pizza.setNome(teclado.next());
                   
                   System.out.print("Insira o tamanho em cm: ");
                   pizza.setTamanho(teclado.nextInt());
                   
                   System.out.print("Insira o preço: ");
                   pizza.setPrecoPizza(teclado.nextFloat());
                   
                   System.out.print("Uma indicação de sabor: ");
                   pizza.setSabor(teclado.next());
                   
                   System.out.print("Insira o ingrediente principal: ");
                   pizza.setIngrediente1(teclado.next());
                   
                   System.out.print("Insira o ingrediente secundario: ");
                   pizza.setIngrediente2(teclado.next());
                   
                   pizza.exibirPizza();
                   cardapio.adicionarPizza(pizza);
                   break;
                   
                   
               case 2:
                   Bebida bebida = new Bebida();
                   System.out.print("Insira o nome da bebida: ");
                   bebida.setNome(teclado.next());
                   
                   System.out.print("Insira a quantidade em ML: ");
                   bebida.setMl(teclado.nextInt());
                   
                   System.out.print("Insira o preço: R$");
                   bebida.setPrecoBebida(teclado.nextFloat());
                   
                   bebida.exibirBebida();
                   cardapio.adicionarBebiba(bebida);
                   break;
                   
                   
               case 3:
                   cardapio.listarCardapio();
                   break;
                   
                   
               case 4: 
                   System.out.println("Selecione a mesa que queira usar de 1 a 10: ");
                   int numeroMesa = teclado.nextInt();
                   
                   System.out.println("Escolha uma das pizzas do nosso cardápio: ");
                   cardapio.listarPizza();
                   int indicePizza = teclado.nextInt();
                   Pizza pizzaEscolhida = cardapio.pizzas.get(indicePizza);
                   
                   System.out.println("Agora, escolha uma das nossas bebidas: ");
                   cardapio.listarBebida();
                   int indiceBebida = teclado.nextInt();
                   Bebida bebidaEscolhida = cardapio.bebidas.get(indiceBebida);
                   
                   Pedido pedido = new Pedido(numeroMesa, pizzaEscolhida, bebidaEscolhida);
                   cardapio.adicionarPedido(pedido);
                   System.out.println("Pedido já adicionado para preparo na cozinha :D");
                   pedido.exibirPedido();
                   break;
                   
                   
               case 5: 
                   System.out.println("O proximo pedido a ser preparado pela cozinha é: ");
                   cardapio.listarPedido();
                   
                   break;
                        
           }

       } while(opcao != 6);
    }
}
