package com.exercicios.logica;

import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        
        /*
        23. Faça um algoritmo que receba um número e mostre uma mensagem caso 
        este número seja maior que 80, menor que 25 ou igual a 40;
         */
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        
        if (numero > 80 || numero < 25 || numero ==40) {
            System.out.println("O número atende a um dos 3 critérios.");
        }

    }
    
}
