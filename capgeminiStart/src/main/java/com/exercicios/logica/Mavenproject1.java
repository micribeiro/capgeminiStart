/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.exercicios.logica;

import java.util.Scanner;

public class Mavenproject1 {

    public static void main(String[] args) {
        //1. Faça um algoritmo que receba dois números e exiba o resultado da 
        //sua soma;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int numb1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int numb2 = scan.nextInt();

        int sum = numb1 + numb2;
        System.out.println("Soma: " + sum);

        //2. Faça um algoritmo que receba dois números e ao final mostre a soma,
        //subtração, multiplicação e a divisão dos dois números lidos;
        int subt = numb1 - numb2;
        int mult = numb1 * numb2;
        float div = numb1 / numb2;

        System.out.println("Subtração: " + subt + "; Multiplicação: " + mult
                + "; Divisão: " + div);

        /*
        3. Escreva um algoritmo para determinar o consumo médio de um automóvel 
        sendo fornecida a distância total percorrida pelo automóvel e o total 
        de combustível gasto;
         */
        System.out.println("Distância percorrida em km: ");
        float distancia = scan.nextFloat();
        System.out.println("Combustível gasto em litros: ");
        float combustivelGasto = scan.nextFloat();

        float consumoMedio = distancia / combustivelGasto;
        System.out.println("Autonomia do automóvel: " + consumoMedio + " km por litro");

        /*
        4. Escreva um algoritmo que leia o nome de um vendedor, o seu salário 
        fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo 
        que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
        informar o seu nome, o salário fixo e salário no final do mês;
         */
        System.out.println("Digite o nome do vendedor: ");
        String vendedor = scan.next();
        System.out.println("Digite o salário fixo do vendedor: ");
        float salarioFixo = scan.nextFloat();
        System.out.println("Digite o valor das vendas desse vendedor nesse "
                + "mês: ");
        float totalVendas = scan.nextFloat();

        double salarioFinal = salarioFixo + (totalVendas * 0.15);

        System.out.println("Nome: " + vendedor);
        System.out.println("Salário fixo: " + salarioFixo);
        System.out.println("Salário final: " + salarioFinal);

        /*
        5. Escreva um algoritmo que leia o nome de um aluno e as notas das três 
        provas que ele obteve no semestre. No finalinformar o nome do aluno e a 
        sua média (aritmética);
         */
        System.out.println("Digite o nome do aluno:");
        String nomeAluno = scan.next();

        System.out.println("Digite a primeira nota: ");
        float nota1 = scan.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = scan.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota3 = scan.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Nome: " + nomeAluno);
        System.out.println("Média: " + media);

        /*
        6. Leia dois valores para as variáveis A e B, e efetuar as trocas dos 
        valores de forma que a variávelApasse a possuir ovalor da variável B e 
        a variável B passe a possuir o valor da variável A. Apresentar os 
        valores trocados;
         */
        System.out.println("Digite o valor de a: ");
        int a = scan.nextInt();
        System.out.println("Digite o valor de b: ");
        int b = scan.nextInt();
        int c = a;
        a = b;
        b = c;
        
        System.out.println("Os valores de a e b são, respectivamente: " + a + " e " + b);
        
        /*
        7. Leia uma temperatura em graus Celsius e apresentá-la convertida em 
        graus Fahrenheit. Afórmula de conversão é: F=(9*C+160) / 5, sendo F a 
        temperatura em Fahrenheit e C a temperatura em Celsius;
        */
        System.out.println("Digite a temperatura em graus Celsius: ");
        float tCelsius = scan.nextFloat();
        
        float tFahrenheit = ((9*tCelsius)+160)/5;
        System.out.println("Temperatura em Fahrenheit: " + tFahrenheit);
        
        /*
        8. Elabore um algoritmo que efetue a apresentação do valor da conversão 
        em real (R$) de um valor lido em dólar (US$). O algoritmo deverá 
        solicitar o valor da cotação do dólar e também aquantidade de dólares 
        disponíveis com ousuário;
        */
        System.out.println("Digite o valor que você possui em dólares: ");
        float valorUSD = scan.nextFloat();
        System.out.println("Digite a cotação do dólar no momento: ");
        float cotacaoUSD = scan.nextFloat();
        
        float valorBRL = valorUSD * cotacaoUSD;
        System.out.println("Valor disponível: R$ " + valorBRL);
        
        /*
        9. Faça um algoritmo que receba um valor que foi depositado e exiba o 
        valor com rendimento após um mês.Considere fixo o juro da poupança em 
        0,07% a. m;
        */
        System.out.println("Digite o valor depositado: ");
        double valorDepositado = scan.nextFloat();
        double jurosMes = 0.0007;
        
        double valorFuturo = valorDepositado + (jurosMes * valorDepositado);
        System.out.println("Valor após um mês na poupança: " + valorFuturo);
        
        /*
        10. A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)
        prestações sem juros. Faça um algoritmo que receba um valor de uma 
        compra e mostre o valor das prestações;
        */
        System.out.println("Digite o valor da compra: ");
        float compra = scan.nextFloat();
        
        float prestacoes = compra/5;
        System.out.println("O valor da prestação é: " + prestacoes);
        
        /*
        11. Faça um algoritmo que receba o preço de custo de um produto e mostre
        o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de 
        acordo com um percentual informado pelo usuário;
        */
        System.out.println("Digite o custo do produto: ");
        float custo = scan.nextFloat();
        System.out.println("Digite a margem de lucro em porcentagem: "
                + "(Ex: 15 para 15%)");
        float porcentagemAcrescimo = scan.nextFloat();
        
        float valorVenda = custo * (1 + porcentagemAcrescimo/100);
        System.out.println("Valor de venda: R$ " + valorVenda);
        
        /*
        12. O custo de um carro novo ao consumidoré a soma do custo de fábrica 
        mais o percentual do distribuidor e dos impostos aplicados (primeiro os 
        impostos são aplicados sobre o custo de fábrica, e depois o percentual 
        do distribuidor sobre o resultado). Supondo que o percentual do 
        distribuidor seja de 28% e os impostos 45%, escreva um algoritmo que 
        leia o custo de fábrica de um carro e informe o custo ao consumidor 
        do mesmo;
        */
        System.out.println("Insira o custo de fábrica: ");
        double custoFabrica = scan.nextDouble();
        double impostos = 0.45*custoFabrica;
        double percentualDist = 0.28*(impostos + custoFabrica);
        
        double custoConsumidor = custoFabrica + impostos + percentualDist;
        System.out.println("Custo ao consumidor: R$ " + custoConsumidor);
        
        /*
        13. Faça um algoritmo que receba um número e mostre uma mensagem caso 
        este número seja maior que 10;
        */
        System.out.println("Insira um número: ");
        int numero = scan.nextInt();
        
        if (numero > 10) {
            System.out.println("Maior que 10");
        } else {
            System.out.println("Não é maior que 10");
        }
        
        /*
        14. Escreva um algoritmo que leia dois valores inteiro distintos e 
        informe qual é o maior;
        */
        System.out.println("Informe o primeiro número: ");
        int numero1 = scan.nextInt();
        System.out.println("Informe o segundo número: ");
        int numero2 = scan.nextInt();
        
        if (numero1 > numero2){
            System.out.println("Número 1 é maior.");
        } else if (numero2 > numero1){
            System.out.println("Número 2 é maior.");
        } else {
            System.out.println("Responda novamente da próxima vez.");    
        }
        
        /*
        15. Faça um algoritmo que receba um número e diga se este número está 
        no intervalo entre 100 e 200;
        */
        System.out.println("Digite um número inteiro qualquer: ");
        int numeroIntervalo = scan.nextInt();
        
        if (numeroIntervalo >= 100 && numeroIntervalo <= 200){
            System.out.println("Dentro do intervalo.");
        } else {
            System.out.println("Fora do intervalo.");
        }
        
        
    }
}
 