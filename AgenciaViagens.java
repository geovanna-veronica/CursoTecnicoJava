package com.mycompany.agenciaviagens;

import java.util.Scanner;


public class AgenciaViagens {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Viagens viagens1 = new Viagens();
        Viagens.Transporte transporte;
        Viagens.Hospedagem hospedagem;
        Viagens.PacoteViagem pacoteViagem;
        Viagens.Venda venda;
        
        
        System.out.print("Informe o tipo de transporte: ");
        String tipoTransporte = teclado.next();
        System.out.print("Infome o valor do transporte em dólar: ");
        float valorTransporte = teclado.nextFloat();
        System.out.print("Informe o destino: ");
        String destino = teclado.next();
        
        transporte = viagens1.new Transporte(tipoTransporte, valorTransporte);
        
        
        System.out.print("Informe a descrição da hospedagem: "); 
        String descricao = teclado.next();
        System.out.print("Informe o valor da díaria: ");
        float valorDiaria = teclado.nextFloat();
        System.out.print("Quantos dias irá ficar hospedado? ");
        int quantidadeDias = teclado.nextInt();
        
        hospedagem = viagens1.new Hospedagem(descricao, valorDiaria);
        
        
        pacoteViagem = viagens1.new PacoteViagem(transporte, hospedagem, destino, quantidadeDias);
        
        System.out.print("Informe a margem de lucro que deseja, em porcentagem: " );
        float margem = teclado.nextFloat();
        System.out.print("Informe valores adicionais: " );
        float valor = teclado.nextFloat();
        float totalPacoteDolar = pacoteViagem.TotalLucro(margem, valorDiaria);
        
        
        
        System.out.println("Tudo pronto para iniciar a venda!");
        System.out.print("Por favor, informe o nome do cliente: ");
        String nome = teclado.next();
        System.out.print("Informe a forma de pagamento: ");
        String formaPag = teclado.next();
        
        venda = viagens1.new Venda(nome, formaPag, pacoteViagem);
        
        System.out.print("Informe a cotação do dólar no dia atual: ");
        float cotacaoDolar = teclado.nextFloat();
        
        
        
        System.out.println("-----------------------------");
        System.out.println("Informações da Venda:");
        System.out.println("Nome: " + nome);
        System.out.println("Forma de pagamento: " + formaPag);
        System.out.println("Pacote de Viagem em dólar: " + totalPacoteDolar);
        System.out.println("Pacote de Viagem em real: " + totalPacoteDolar * cotacaoDolar);
        
        System.out.println("---------------------------");
        
        System.out.println("O Pacote de Viagem está atualmente assim: ");
        System.out.println("~~~~~~~~TRANSPORTE~~~~~~~~");
        System.out.println("Tipo de transporte: " + tipoTransporte);
        System.out.println("Valor do transporte: " + valorTransporte);
        System.out.println("Destino: " + destino);
        
        System.out.println("---------------------------");
        
        System.out.println("~~~~~~~~HOSPEDAGEM~~~~~~~~");
        System.out.println("Descrição informada: " + descricao);
        System.out.println("Valor da díaria em dólar: " + valorDiaria);
        System.out.println("Quantidade de dias hospedado: " + quantidadeDias);
        System.out.println("Valor total da hospedagem em dólar: " + hospedagem.totHospedagem(quantidadeDias));
        
        System.out.println("-----------------------------");
        System.out.println("Margem de lucro desejada em porcentagem: " + margem);
        System.out.println("Valores adicionais: " + valor);
        
        
        
        
        
        
        
    }
}
