/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.exercicios.logica;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        /*
        16. Escreva um algoritmo que leia o nome e as três notas obtidas por um 
        aluno durante o semestre. Calcular a sua média (aritmética), informar o 
        nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e 
        Recuperação (media entre 5.1 a 6.9);
        */
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nome = scan.next();
        System.out.println("Digite a primeira nota (0 a 10):");
        float nota1 = scan.nextFloat();
        System.out.println("Digite a segunda nota (0 a 10):");
        float nota2 = scan.nextFloat();
        System.out.println("Digite a terceira nota (0 a 10):");
        float nota3 = scan.nextFloat();
        
        float media = (nota1 + nota2 + nota3)/3;
        
        if (media >= 7){
            System.out.println(nome + ": Aprovado.");
        }else if (media <= 5){
            System.out.println(nome + ": Reprovado.");
        }else if (media >= 5.1 && media <= 6.9){
            System.out.println(nome + ": Recuperação.");
        } else {
            System.out.println("Verificar notas.");
        }
    }
    
}
