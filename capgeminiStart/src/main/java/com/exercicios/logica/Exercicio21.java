package com.exercicios.logica;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        /*
        21. Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, 
        idade e saúde) e informe se está apta ou não para cumprir o serviço 
        militar obrigatório. Informe os totais;
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número de pessoas: ");
        int numeroPessoas = scan.nextInt();
        
        String[] nomes = new String[numeroPessoas];
        String[] sexos = new String[numeroPessoas];
        int[] idades = new int[numeroPessoas];
        String[] saude = new String[numeroPessoas];
        
        for(int i = 0; i < numeroPessoas; i++){
            System.out.println("Digite o nome da " + (i+1) + "ª pessoa: ");
            nomes [i] = scan.next();
            System.out.println("Digite o sexo da " + (i+1) + "ª pessoa: ");
            sexos [i] = scan.next();
            System.out.println("Digite a idade da " + (i+1) + "ª pessoa: ");
            idades [i] = scan.nextInt();
            System.out.println("Digite o estado de saúde da " + (i+1) + "ª pessoa: ");
            System.out.println("Digite boa ou ruim: ");
            saude [i] = scan.next();
            
            if (sexos[i].equalsIgnoreCase("Masculino") && idades[i] > 17 && saude[i].equalsIgnoreCase("boa")){
                System.out.println(nomes[i] + ": apto.");
            } else {
                System.out.println(nomes[i] + ": inapto(a).");
            }
        }
        
    }
    
}
