/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.exercicios.logica;

import java.util.Scanner;

/**
 *
 * @author Micael
 */
public class Exercicio31Corrigir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        31. Dados três valores A, B e C, em que A e B são números reais e C é 
        um caractere, pede-se para imprimir o resultado da operação de A por B 
        se C for um símbolo de operador aritmético; caso contrário deve ser 
        impressa uma mensagem de operador não definido. Tratar erro de divisão 
        por zero;
        */
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        double a = scan.nextDouble();
        
        System.out.println("Digite o valor de B: ");
        double b = scan.nextDouble();
        
        System.out.println("Digite o operador aritmético (+, -, * ou /): ");
        String c = scan.next();
        
        if(c == "+"){
            System.out.println("A + B = " + (a+b));
        } else if(c == "-"){
            System.out.println("A - B = " + (a-b));
        } else if(c == "/" && b == 0){
            System.out.println("Não é possível dividir por zero. "
                    + "Rode novamente o programa");
        } else if(c == "/"){
            System.out.println("A / B = " + (a/b));
        } else if(c == "*"){
            System.out.println("A * B = " + (a*b));
        } else {
            System.out.println("Operador não definido");
        }
            
    }
    
}
