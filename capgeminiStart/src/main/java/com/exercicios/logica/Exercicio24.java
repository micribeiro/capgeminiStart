package com.exercicios.logica;

import java.util.Scanner;

public class Exercicio24 {

    public static void main(String[] args) {
        
        /*
               24. Faça um algoritmo que receba “N” números e mostre positivo, 
        negativo ou zero para cada número;
         */
         Scanner scan = new Scanner(System.in);
         System.out.println("Quantos números você quer ler?");
         int N = scan.nextInt();
         
         for (int i = 0; i < N; i++) {
            System.out.println("Digite o " + (i+1) + "º número.");
            int numero = scan.nextInt();
            if (numero < 0) {
                System.out.println("Negativo");
            } else if (numero == 0) {
                System.out.println("Zero");
            } else {
                System.out.println("Positivo");
            }
            
         }
    }
    
}
