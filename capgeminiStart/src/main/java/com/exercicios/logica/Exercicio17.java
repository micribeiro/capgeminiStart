/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.exercicios.logica;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        /*
        17. Leia 80 números e ao final informar quantos número(s) est(á)ão no 
        intervalo entre 10 (inclusive) e 150 (inclusive);
        */
        Scanner scan = new Scanner(System.in);
        
        int[] numeros = new int[80];
        int contador = 0;
        
        for(int i = 0;i < 80;i++){
            System.out.println("Digite o " + (i+1) + "º número: ");
            numeros [i] = scan.nextInt();
            if(numeros[i] >= 10 && numeros[i] <= 150){
                contador ++;
            }
        }
        
        System.out.println("Quantidade de números dentro do intervalo: " + contador);

    }
    
}
