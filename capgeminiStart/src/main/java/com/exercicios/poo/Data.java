package com.exercicios.poo;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.GregorianCalendar;

public class Data implements Cloneable {
    /*
        8. Escreva uma classe Data cuja instância (objeto) represente uma data. 
        Esta classe deverá dispor dos seguintes métodos:
        
        (OK)a. Construtor: define a data que determinado objeto (através de 
        parâmetro), este método verifica se a data está correta, caso não esteja 
        a data é configurada como 01/01/0001
        (OK)b. Compara: recebe como parâmetro um outro objeto da Classe data, 
        compare com a data corrente e retorne:
            i. 0 se as datas forem iguais;
            ii. 1 se a data corrente for maior que a do parâmetro;
            iii. -1 se a data do parâmetro for maior que a corrente.
        (OK)c. GetDia: retorna o dia da data
        (OK)d. GetMes: retorna o mês da data
        (OK)e. GetMesExtenso: retorna o mês da data corrente por extenso
        (OK)f. GetAno: retorna o ano da data
        (OK)g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto 
        e falso caso contrário
        (OK)h. Clone: o objeto clona a si próprio, para isto, ele cria um novo 
        objeto da classe Data com os mesmos valores de atributos e retorna sua 
        referência pelo método
        */
    
        private String data;
        LocalDate date;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
    public Data(String data){
                
        try{
            this.data = data;
            date = LocalDate.parse(this.data, formatter);
            
        }catch(DateTimeParseException exception){
            System.out.println("Formato de data inválido. Devido a isso, o "
                    + "valor armazenado foi 01/01/0001");
            this.data = "01/01/0001";
            date = LocalDate.parse(this.data, formatter);
        }
    }
    
    public LocalDate converte(String dataD){
        LocalDate dataE;
        return dataE = LocalDate.parse(dataD, formatter);
    }
    
    public int compara(String data1){
        LocalDate dataInfo = this.converte(data1);
        if (ChronoUnit.DAYS.between(dataInfo, LocalDate.now()) > 0){
            return 1;
        } else if(ChronoUnit.DAYS.between(dataInfo, LocalDate.now()) < 0){
            return -1;
        } else{
            return 0;
        }
    }
    
    public int getDia(String data){
        LocalDate dataGuardada = this.converte(data);
        return dataGuardada.getDayOfMonth();
    }
    
    public int getMes(String data){
        LocalDate dataGuardada = this.converte(data);
        return dataGuardada.getMonthValue();
    }
    
    public Month getMesExtenso(String data){
        LocalDate dataGuardada = this.converte(data);
        return dataGuardada.getMonth();
    }
    
    public int getAno(String data){
        LocalDate dataParse = this.converte(data);
        return dataParse.getYear();
    }
    
    public boolean isBissexto(String data){
        LocalDate dataParse = this.converte(data);
        return dataParse.isLeapYear();
    }
    
    public Object clone() throws CloneNotSupportedException{ 
        return super.clone();
        //cria um clone (ex: teste.clone())
    }

    @Override
    public String toString() {
        return "Data{" + "data=" + data + '}';
    }
    
    
    
}
