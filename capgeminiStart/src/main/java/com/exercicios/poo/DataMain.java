package com.exercicios.poo;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DataMain {
    public static void main(String[] args) throws ParseException, CloneNotSupportedException {
        Scanner scan = new Scanner(System.in);
        
        LocalDate hoje = LocalDate.now();
        
        DateTimeFormatter formatter
                    = DateTimeFormatter.ofPattern("dd/MM/yyyy"); //formato que recebe
        
        try{
            System.out.println("Digite a data de nascimento:");
            String dataNascimento = scan.next();
            LocalDate dataNasc
                    = LocalDate.parse(dataNascimento, formatter); //reconhece e converte o String em LocalDate
                        System.out.println("hoje: " + hoje);
            System.out.println("data: " + dataNasc);

            long idade = ChronoUnit.YEARS.between(dataNasc, hoje);
            System.out.println("Idade: " + idade);
        }catch (DateTimeParseException exception){
            System.out.println("Formato inválido. Devido a isso o valor "
                    + "armazenado foi 01/01/0001.");
            
            LocalDate dataNasc = LocalDate.parse("01/01/0001",formatter);
            
            long idade = ChronoUnit.YEARS.between(dataNasc, hoje);
            System.out.println("Idade: " + idade);
        }
        
        System.out.println("-------------------------------------------------------------");
        
        Data teste = new Data("21/12/2022");
        
        System.out.println(teste.compara("21/12/1997"));
        
        System.out.println(teste.getDia("21/12/1997"));
        
        System.out.println(teste.getMes("21/12/1997"));
        
        System.out.println(teste.getMesExtenso("21/12/1997"));
        
        System.out.println(teste.getAno("21/12/1997"));
        
        System.out.println(teste.isBissexto("21/12/1997"));
        
        Data cloneData = (Data) teste.clone();
        
        System.out.println(teste.toString());
        
        System.out.println(cloneData.toString());
        
    }
    
}
