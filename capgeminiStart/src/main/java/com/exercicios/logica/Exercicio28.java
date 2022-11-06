package com.exercicios.logica;

import java.util.Scanner;

public class Exercicio28 {

    public static void main(String[] args) {
        
        /*
        28. Escreva um algoritmo para uma empresa que decide dar um reajuste a 
        seus 584 funcionários de acordo com os seguintes critérios:
        
        a. 50% para aqueles que ganham menos do que três salários mínimos;
        b. 20% para aqueles que ganham entre três até dez salários mínimos;
        c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
        d. 10% para os demais funcionários.

        Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
        Calcule o seu novo salário reajustado. Escrever o nome do funcionário, 
        o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar 
        sua folha de pagamento;
        */
        
        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[5];
        double[] salarios = new double[5];
        double[] reajustados = new double[5];
        double[] reajustes = new double[5];
        
        double somaSalarios = 0;
        double somaReajustados = 0;
        
        System.out.println("Digite o valor do salário mínimo: ");
        double salarioMinimo = scan.nextDouble();
        
        for(int i = 0; i < nomes.length; i++){
            System.out.println("Digite o nome da " + (i+1) + "ª pessoa: ");
            nomes[i] = scan.next();
            
            System.out.println("Digite o salário da " + (i+1) + "ª pessoa: ");
            salarios[i] = scan.nextDouble();
            
            if(salarios[i] < 3*salarioMinimo){
                reajustados[i] = salarios[i] + salarios[i]*0.5;
                reajustes[i] = 0.5;
            } else if (salarios[i] >= 3*salarioMinimo && salarios[i] <= 10*salarioMinimo){
                reajustados[i] = salarios[i] + salarios[i]*0.2;
                reajustes[i] = 0.2;
            } else if (salarios[i] > 10*salarioMinimo && salarios[i] <= 20*salarioMinimo){
                reajustados[i] = salarios[i] + salarios[i]*0.15;
                reajustes[i] = 0.15;
            } else {
                reajustados[i] = salarios[i] + salarios[i]*0.1;
                reajustes[i] = 0.1;
            }
            
            somaSalarios = somaSalarios + salarios[i];
            somaReajustados = somaReajustados + reajustados[i];
            
        }
        
        System.out.println("--------------------------------");
        System.out.println("Nome    Reajuste    Novo Salário");
        System.out.println("--------------------------------");
        
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i] + "    " + reajustes[i] + "     " + reajustados[i]);
        }
        
        double aumentoFolha = somaReajustados - somaSalarios;
        
        System.out.println("Aumento na folha de pagamento: R$" + aumentoFolha);
        
    }
    
}
