package com.exercicios.logica;

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        /*
        33. A escola “APRENDER” faz o pagamento de seus professores por 
        hora/aula. Faça um algoritmo que calcule e exiba o salário de um 
        professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
        
        a. Professor Nível 1 R$12,00 por hora/aula;
        b. Professor Nível 2 R$17,00 por hora/aula;
        c. Professor Nível 3 R$25,00 por hora/aula.
        */
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o nível do professor (1, 2 ou 3): ");
        String nivel = scan.next();
        
        System.out.println("Digite as horas trabalhadas: ");
        int horasTrabalhadas = scan.nextInt();
        
        int salario = 0;
        
        switch(nivel){
            case "1":
                salario = horasTrabalhadas * 12;
                break;
            case "2":
                salario = horasTrabalhadas * 17;
                break;
            case "3":
                salario = horasTrabalhadas * 25;
                break;
            default:
                System.out.println("Verifique sua resposta e tente novamente.");
                break;
        }
        
        System.out.println("Salário: R$" + salario);
        
    }
    
}
