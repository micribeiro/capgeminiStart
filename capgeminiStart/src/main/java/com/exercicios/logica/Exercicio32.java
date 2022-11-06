package com.exercicios.logica;

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        
        /*
        32. Escreva um algoritmo que leia três valores inteiros e verifique se 
        eles podem ser os lados de um triângulo. Se forem, informar qual o tipo 
        de triângulo que eles formam: equilátero, isóscele ou escaleno. 
        Propriedade: o comprimento de cada lado de um triângulo é menor do que 
        a soma dos comprimentos dos outros dois lados.
        
        a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
        b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
        c. Triângulo equilátero é também isóscele;
        d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o comprimento do primeiro lado: ");
        int a = scan.nextInt();
        System.out.println("Digite o comprimento do segundo lado: ");
        int b = scan.nextInt();
        System.out.println("Digite o comprimento do terceiro lado: ");
        int c = scan.nextInt();
        
        if ((a == b & a != c) || (a == c & a != b) || (b == c && b != a)){
            System.out.println("Isóceles");
        } else if (a == b & a == c & b == c){
            System.out.println("Equilátero");
        } else if (a != b & a != c & b != c){
            System.out.println("Escaleno");
        } else {
            System.out.println("Indefinido");
        }
        
       
        
    }
    
}
