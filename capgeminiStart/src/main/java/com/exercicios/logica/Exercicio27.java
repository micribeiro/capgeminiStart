package com.exercicios.logica;

import java.util.Scanner;

public class Exercicio27 {

    public static void main(String[] args) {
        /*
        27. A concessionária de veículos “CARANGO” está vendendo os seus 
        veículos com desconto. Faça um algoritmo que calcule e exiba o valor do 
        desconto e o valor a ser pago pelo cliente. O desconto deverá ser 
        calculado sobre o valor do veículo de acordo com o combustível 
        (álcool – 25%, gasolina – 21% ou diesel –14%). Com valor do veículo zero 
        encerra entrada de dados. Informe total de desconto e total pago pelos 
        clientes;
        */
        Scanner scan = new Scanner(System.in);
        
        double valorVeiculo = 1;
        double valorDesconto;
        double porcentagemDesconto = 0;
        double valorFinal;
        
        while (valorVeiculo != 0) {
            System.out.println("Digite o valor do veículo: ");
            valorVeiculo = scan.nextInt();
            if (valorVeiculo == 0) break;
                        
            System.out.println("Digite: 1 para veículo a álcool, 2 para "
                    + "veículo a gasolina e 3 para veículo a diesel.");
            int combustivel = scan.nextInt();
            
            switch (combustivel){
                case 1:
                    porcentagemDesconto = 0.25;
                    break;
                case 2:
                    porcentagemDesconto = 0.21;
                    break;
                case 3:
                    porcentagemDesconto = 0.14;
                    break;
                default:
                    System.out.println("Tente novamente");
                    break;
            }
            
            valorFinal = valorVeiculo - (porcentagemDesconto * valorVeiculo);
            System.out.println("Valor que o cliente vai pagar: R$" 
                    + valorFinal);
            
            System.out.println("Para parar o loop, basta digitar 0 no campo "
                    + "de valor do veículo");
                    
        }
        
        
    }
    
}
