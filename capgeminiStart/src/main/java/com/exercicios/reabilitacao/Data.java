package com.exercicios.reabilitacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Data {
    /*
    Escreva uma classe Data cuja instância (objeto) represente uma data. Esta 
    classe deverá dispor dos seguintes métodos:
a. Construtor: define a data que determinado objeto (através de parâmetro), 
    este método verifica se a data está correta, caso não esteja a data é 
    configurada como 01/01/0001
b. Compara: recebe como parâmetro um outro objeto da Classe data, compare com a 
    data corrente e retorne:
    i. 0 se as datas forem iguais;
    ii. 1 se a data corrente for maior que a do parâmetro;
    iii. -1 se a data do parâmetro for maior que a corrente.
c. GetDia: retorna o dia da data
d. GetMes: retorna o mês da data
e. GetMesExtenso: retorna o mês da data corrente por extenso
f. GetAno: retorna o ano da data
g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
h. Clone: o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os mesmos valores de atributos e retorna sua referência pelo método
    */
    
    private String date;
    LocalDate date1;
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Data(String date){
        try{
            this.date = date;
            date1 = LocalDate.parse(this.date, formatter);
        } catch (DateTimeParseException exception){
            System.out.println("Formato de data incorreto. Valor armazenado:"
                    + "01/01/0001");
            this.date = "01/01/0001";
            date1 = LocalDate.parse(this.date, formatter);
        }
    }
    
}
