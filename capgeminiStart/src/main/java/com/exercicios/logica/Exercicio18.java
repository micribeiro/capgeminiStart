package com.exercicios.logica;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        /*
        18. Faça um algoritmo que receba a idade de 75 pessoas e mostre 
        mensagem informando “maior de idade” e “menor de idade” para cada 
        pessoa. Considere a idade a partir de 18 anos como maior de idade;
        */
        
        Scanner scan = new Scanner(System.in);
        int[] idades = new int[75];
        
        for(int i = 0; i < idades.length; i++){
            System.out.println("Idade da " + (i+1) + "ª pessoa: ");
            idades[i] = scan.nextInt();
            if (idades[i] > 125){
                System.out.println("É você, Wolverine?");
            } else if (idades[i] > 17) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade.");
            }
        }
        
        
    }
    
}
