package com.mycompany.agenciaviagens;

public class Viagens {

    
    class Transporte {
        String tipo;
        float valor;
        
        public Transporte(String tipo, float valor) {
            this.tipo = tipo;
            this.valor = valor;
        }


    }
    
    class Hospedagem {
        String descricao;
        float valorDiaria;
        
        public Hospedagem(String descricao, float valorDiaria) {
            this.descricao = descricao;
            this.valorDiaria = valorDiaria;
        }
        
        public float totHospedagem(int quantidadeDias){
            return this.valorDiaria * quantidadeDias;
        }
    }
    
    class PacoteViagem {
        
        Transporte transporte;
        Hospedagem hospedagem;
        String destino;
        int quantidadeDias;
        
        public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantidadeDias) {
            this.transporte = transporte;
            this.hospedagem = hospedagem;
            this.destino = destino;
            this.quantidadeDias = quantidadeDias;
        }
        
        
        public float TotalLucro(float margem, float valorAdicional) {
            float totHospedagem = hospedagem.totHospedagem(quantidadeDias);
            float lucro = (transporte.valor + totHospedagem + valorAdicional) * (margem / 100);
            return transporte.valor + totHospedagem + lucro + valorAdicional;
        }
 
    }
    
    class Venda {

        String nome;
        String formaPag;
        PacoteViagem pacoteViagem;
        
        public Venda(String nome, String formaPag, PacoteViagem pacoteViagem){
            this.nome = nome;
            this.formaPag = formaPag;
            this.pacoteViagem = pacoteViagem;
        }
        
        
        public float ConversaoReal(float cotacaoDolar) {
            return pacoteViagem.TotalLucro(0, 0) * cotacaoDolar;
        }
   
    }
    
}
