package com.exercicios.logica;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        
        /*
        35. Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. 
        Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
        
        Tipo de Cliente Valor do KW/h
        a. (Residência) 0,60;
        b. (Comércio) 0,48;
        c. (Indústria) 1,29.
        */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Selecione o tipo de cliente (a: residência; "
                + "b: comércio; c: indústria): ");
        String tipoCliente = scan.next();
        
        double conta = 0;
        
        System.out.println("Digite o consumo em KWh: ");
        double consumoKWh = scan.nextDouble();
        
        switch(tipoCliente){
            case "a":
                conta = consumoKWh * 0.6;
                break;
            case "b":
                conta = consumoKWh * 0.48;
                break;
            case "c":
                conta = consumoKWh * 1.29;
                break;
        }
        
        System.out.println("Conta: R$" + conta);
        
    }
    
}
