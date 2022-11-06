package com.exercicios.logica;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        /*
        20. A concessionária de veículos “CARANGO VELHO” está vendendo os seus 
        veículos com desconto. Faça um algoritmo que calcule e exiba o valor do 
        desconto e o valor a ser pago pelo cliente de vários carros. O desconto 
        deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e 
        acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar 
        calculando desconto até que a resposta seja: “(N) Não”. Informar total 
        de carros com ano até 2000 e total geral;
         */
        Scanner scan = new Scanner(System.in);
        String resposta = "S";
        double valorDesconto = 0;
        int antigos = 0;
        
        do {
            System.out.println("Digite o ano do veículo: ");
            int anoVeiculo = scan.nextInt();
            System.out.println("Digite o valor do veículo: ");
            int valorVeiculo = scan.nextInt();
            if (anoVeiculo <= 2000){
                valorDesconto = 0.12 * valorVeiculo;
                antigos++;
            } else {
                valorDesconto = 0.07 * valorVeiculo;
            }
            System.out.println("Valor do Desconto: " + valorDesconto);
            System.out.println("Deseja calcular mais algum desconto?");
            resposta = scan.next();
            
        } while (resposta == "S" || resposta == "s");
        
        System.out.println("Quantidade de veículos com ano máximo 2000: " 
                + antigos + " veículos.");
    }

}
