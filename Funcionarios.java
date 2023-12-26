package com.mycompany.atividade03;

public class Funcionarios extends Informacoes {
    
    private float salario;

    @Override
    public float calcAssalariado(float salario) {
        this.salario = salario;
        return salario;
    }

    @Override
    public void calcHorista(int hora, float valorHora) {
        this.salario = hora * valorHora;
        
    }

    @Override
    public void calcAumentoGeral(float aumento) {
        this.salario = ((aumento * salario) / 100) + salario;
    }

    

    @Override
    public void exibir() {
        System.out.println("\n");
        System.out.println("Nome do funcionário: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Setor atual: " + getSetor());
        System.out.println("Ramo de recebimento: " + getTipo());
        
        if("Assalariado".equals(getTipo())) {
            System.out.println("Total a receber R$" + salario);
            
        } else {
            System.out.println("Total a receber R$" + salario);

        }
        System.out.println("\n");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

 
}
