package com.mycompany.atividade04;

import java.util.ArrayList;
import java.util.Scanner;

public class ATIVIDADE04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Pagamentos> pagamentos = new ArrayList<Pagamentos>();
        
        char continuar;
        
        do {
            Pagamentos pagamento = new Pagamentos();
            
            System.out.print("Por favor, insira o tipo de contribuição de imposto: ");
            pagamento.setTipo(teclado.next());
            
            if(pagamento.getTipo().equals("PIS")) {
                System.out.print("Infome o valor do débito: ");
                pagamento.setDebitoPIS(teclado.nextFloat());
                
                System.out.print("Informe o valor do crédito: ");
                pagamento.setCreditoPIS(teclado.nextFloat());
                
                pagamento.PIS(pagamento.getDebitoPIS(), pagamento.getCreditoPIS());
                
            } else if(pagamento.getTipo().equals("IPI")) {
                System.out.print("Infome o total dos produtos: ");
                pagamento.setValorTotIPI(teclado.nextFloat());
                
                System.out.print("Informe o total dos valores adicionais, incluindo frete, seguro e outros: ");
                pagamento.setDespesasIPI(teclado.nextFloat());
                
                System.out.print("Informe a alíquota em porcentagem: ");
                pagamento.setAliquotaIPI(teclado.nextFloat());
                
                pagamento.IPI(pagamento.getAliquotaIPI(), pagamento.getValorTotIPI(), pagamento.getDespesasIPI());
                
            } else {
                System.out.println("Imposto não reconhecido.");
            }
            
            pagamentos.add(pagamento);
            
            System.out.println("Deseja continuar? (S/N) ");
            continuar = teclado.next().charAt(0);
            
            
        } while (continuar == 'S');
        
        for(Pagamentos pagamento : pagamentos) {
            pagamento.exibir();
        }
    }
}
