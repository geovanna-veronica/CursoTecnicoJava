package com.mycompany.atividade03;

import java.util.Scanner;

public class ATIVIDADE03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, indice;
        char continuar;
        
        Funcionarios[] funcionarioNovo = new Funcionarios[10];
        
        for(i = 0; i < 9; i++) {
            funcionarioNovo[i] = new Funcionarios();
        }
        
        do {
            
            System.out.println("Para adicionar um novo funcionário, informe os seguintes dados: ");
            
            System.out.print("Informe o índice que deseja alocar esse funcionário: ");
            indice = teclado.nextInt() - 1;
            
            System.out.print("Infome o nome: ");
            funcionarioNovo[indice].setNome(teclado.next());
            
            System.out.print("Infome o CPF: ");
            funcionarioNovo[indice].setCpf(teclado.nextInt());
            
            System.out.print("Informe o endereço: ");
            funcionarioNovo[indice].setEndereco(teclado.next());
            
            System.out.print("Informe o telefone: ");
            funcionarioNovo[indice].setTelefone(teclado.nextInt());
            
            System.out.print("Agora, informe o setor em que trabalha: ");
            funcionarioNovo[indice].setSetor(teclado.next());
            
            System.out.print("Esse funcionário será Horista ou Assalariado?: ");
            funcionarioNovo[indice].setTipo(teclado.next());
            
            if(funcionarioNovo[indice].getTipo().equals("Assalariado")) {
                System.out.print("Informe o salário correspondente: ");
                float salario = teclado.nextFloat();
                funcionarioNovo[indice].calcAssalariado(salario);
                
            } else if(funcionarioNovo[indice].getTipo().equals("Horista")) {
                System.out.print("Informe as horas trabalhadas: ");
                int hora = teclado.nextInt();
                
                System.out.print("Informe o valor da hora: ");
                float valorHora = teclado.nextFloat();
                funcionarioNovo[indice].calcHorista(hora, valorHora);
                
                
            }
            
            
            System.out.println("Deseja continuar? (S/N) ");
            continuar = teclado.next().charAt(0);
            
        } while(continuar == 'S');
        
        for(i = 0; i < 9; i++) {
            
            if (funcionarioNovo[i] != null) {
                if (funcionarioNovo[i].getNome() != null && !funcionarioNovo[i].getNome().isEmpty()) {
                    funcionarioNovo[i].exibir();
                }
            } else {
                System.out.println("Funcionário não preenchido.");
        }
        }
        
        System.out.println("Deseja aplicar um aumento geral? (S/N) ");
        continuar = teclado.next().charAt(0);
        

        if(continuar == 'S') {
            System.out.println("Informe a porcentagem que deseja aplicar: ");
            float aumento = teclado.nextFloat();
            
            for (i = 0; i < 9; i++) {
                if (funcionarioNovo[i] != null && funcionarioNovo[i].getNome() != null && !funcionarioNovo[i].getNome().isEmpty()) {
                    funcionarioNovo[i].calcAumentoGeral(aumento);
                } 
            }

            // Exibe todos os funcionários após aplicar o aumento
            for (i = 0; i < 9; i++) {
                if (funcionarioNovo[i] != null && funcionarioNovo[i].getNome() != null && !funcionarioNovo[i].getNome().isEmpty()) {
                    funcionarioNovo[i].exibir();
                } 
    }
            
            
 
        } else {
            System.out.println("Saindo . . .");
        }
            
    }
}
