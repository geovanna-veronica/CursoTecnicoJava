
package com.mycompany.atividade03;

public abstract class Informacoes {
    private String nome;
    private int cpf;
    private String endereco;
    private int telefone;
    private String setor;
    private String tipo;
    
    public abstract float calcAssalariado(float salario);
    public abstract void calcHorista(int hora, float valorHora);
    public abstract void calcAumentoGeral(float aumento);
    
    
    public abstract void exibir();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
