package com.exercicios.logica;

import java.util.Scanner;

public class Exercicio22 {

    public static void main(String[] args) {
        /*
        22. Faça um algoritmo que receba o preço de custo e o preço de venda de 
        40 produtos. Mostre como resultado se houve lucro, prejuízo ou empate 
        para cada produto. Informe o valor de custo de cada produto, o valor de 
        venda de cada produto, amédia de preço de custo e do preço de venda;
         */

        Scanner scan = new Scanner(System.in);
        String[] status = new String[40];
        double[] precoCusto = new double[40];
        double[] precoVenda = new double[40];
        double somaCusto = 0;
        double somaVenda = 0;
        
        for (int i = 0; i < 40; i++) {
            System.out.println("Preço de custo do " + (i+1) + "° produto:");
            precoCusto[i] = scan.nextFloat();
            System.out.println("Preço de venda do " + (i+1) + "° produto:");
            precoVenda[i] = scan.nextFloat();
            
            somaCusto = somaCusto + precoCusto[i];
            somaVenda = somaVenda + precoVenda[i];
            
            if(precoVenda[i] > precoCusto[i]){
                status[i] = "Lucro";
            } else if(precoVenda[i] == precoCusto[i]) {
                status[i] = "Empate";
            } else{
                status[i] = "Prejuízo";
            }
        }
        
        System.out.println("Custo   Preço de Venda  Status");
        
        for(int i = 0; i < 40; i++){
            System.out.printf("%.2f     %.2f         %S %n", 
                    precoCusto[i],precoVenda[i], status[i]);
        }
        
        System.out.println("Média do preço de custo: R$" + (somaCusto/40));
        
        System.out.println("Média do preço de venda: R$" + (somaVenda/40));
        
    }

}
