package com.exercicios.logica;

import java.util.Scanner;

public class Exercicio25 {

    public static void main(String[] args) {
        /*
        25. Faça um algoritmo que leia dois números e identifique se são iguais 
        ou diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que 
        eles são iguais. Caso sejam diferentes, informe qual número é o maior, 
        e uma mensagem que são diferentes;
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Número 1: ");
        int numero1 = scan.nextInt();
        System.out.println("Número 2: ");
        int numero2 = scan.nextInt();
        
        if(numero1 == numero2){
            System.out.println("Números iguais.");
        } else if (numero1 > numero2) {
            System.out.println("Números diferentes. Maior número: " + numero1);
        } else {
            System.out.println("Números diferentes. Maior número: " + numero2);
        }
    }
    
}
