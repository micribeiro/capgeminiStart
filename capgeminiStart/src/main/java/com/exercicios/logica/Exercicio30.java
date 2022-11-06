package com.exercicios.logica;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio30 {

    public static void main(String[] args) {
        /*
        30. Escreva um algoritmo que leia três valores inteiros distintos e os 
        escreva em ordem crescente;
        */
        Scanner scan = new Scanner(System.in);
        
        int[] valores = new int[3];
        
        for(int i = 0; i < valores.length; i++){
            System.out.println("Digite o " + (i+1) + "º valor: ");
            valores[i] = scan.nextInt();
        }
        
        Arrays.sort(valores);
        
        System.out.println(Arrays.toString(valores));
        
    }
    
}
