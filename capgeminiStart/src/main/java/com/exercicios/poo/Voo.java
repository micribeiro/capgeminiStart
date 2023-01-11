package com.exercicios.poo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Voo {
      /*
        9. Escreva uma classe em que cada objeto representa um Voo que acontece 
        em determinada data e em determinado horário. Cada vôo possui no máximo 
         100 passageiros, e a classe permite controlar a ocupação das vagas. A 
        classe deve ter os seguintes métodos:

        (OK)a. Construtor: configura os dados do vôo (recebidos como parâmetro): 
        número do vôo, data (para armazenar a data utilize um objeto da classe 
        Data, criada na questão anterior);
        b. ProximoLivre: retorna o número da próxima cadeira livre
        c. Verifica: verifica se o número da cadeira recebido como parâmetro 
        está ocupada
        d. Ocupa: ocupa determinada cadeira do vôo, cujo número é recebido como 
        parâmetro, e retorna verdadeiro se a cadeira ainda não estiver ocupada 
        (operação foi bem sucedida) e falso caso contrário
        e. Vagas: retorna o número de cadeiras vagas disponíveis (não ocupadas) 
        no vôo
        f. GetVoo: retorna o número do vôo
        */
    
    String dataVoo;
    LocalDate data;
    int numeroVoo;
    String[] lugares = new String[100];
    
    public Voo(String dataVoo, int numeroVoo){
        this.dataVoo = dataVoo;
        Data data1 = new Data(this.dataVoo);
        data = data1.converte(dataVoo);
        this.numeroVoo = numeroVoo;
    }

    @Override
    public String toString() {
        return "Voo{" + "dataVoo=" + dataVoo + ", data=" + data + ", numeroVoo=" + numeroVoo + '}';
    }

    public void proximoLivre(){
        int i = 0;
        while(lugares[i].equalsIgnoreCase("Ocupado")){
            i++;
            
        }
        System.out.println("Próximo lugar livre: " + i);
    }
    
       
}
