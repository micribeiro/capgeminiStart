package com.exercicios.logica;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        /*
        19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e 
        informe o nome e se ela é homem ou mulher. No final informe total de 
        homens e de mulheres;
        */
        
        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[56];
        String[] sexos = new String[56];
        int contadorH = 0;
        int contadorF = 0;
        
        for (int i = 0; i < nomes.length; i++) {
            
            System.out.println("Digite o nome da " + (i+1) + "ª pessoa: ");
            nomes[i] = scan.next();
            System.out.println("Digite o sexo da " + (i+1) + "ª pessoa: ");
            System.out.println("(Digite M para masculino e F para feminino)");
            sexos[i] = scan.next();
            
            if (sexos[i].equalsIgnoreCase("M")){
                contadorH++;
            } else {
                contadorF++;
            }
        }
        
        System.out.println("Homens: " + contadorH);
        System.out.println("Mulheres: " + contadorF);
        
    }
    
}
