package com.exercicios.poo;
public class BombaCombustivel {
    /*
        3. Crie uma classe para representar uma BombaCombustivel. A classe 
        BombaCombustivel deve conter os seguintes atributos: tipo de 
        combustível, valor por litro e quantidade de combustível. Além desses 
        atributos a classes deve conter os seguintes métodos.
        
        a. abastecerPorValor; //método onde é informado o valor a ser abastecido 
        e mostra a quantidade de litros que foi colocada no veículo
        b. abastecerPorLitro; // método onde é informado a quantidade em litros 
        de combustível e mostra o valor a ser pago pelo cliente.
        c. alterarValor; //altera o valor do litro do combustível.
        d. alterarCombustivel; //altera o tipo do combustível.
        e. alterarQuantidadeCombustivel; //altera a quantidade de combustível 
        restante na bomba.
        
        Crie uma classe que contenha um método main para testar sua classe 
        BombaCombustível
        */
    
    private String tipoCombustivel;
    private double valorPorLitro;
    private double quantidadeCombustivel;
    
    public int abastecerPorValor(int valor){
        return valor;
    }
    
    public String abastecerPorLitro(int litros){
        return "Valor a ser pago: R$" + litros*valorPorLitro;
    }
    
    public void alterarValor (double valorPorLitro){
        this.valorPorLitro = valorPorLitro;
    }
    
    public void alterarCombustivel(String tipoCombustivel){
        this.tipoCombustivel = tipoCombustivel;
    }
    
    public void alterarQuantidadeCombustivel(double quantidadeCombustivel){
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public BombaCombustivel(String tipoCombustivel, double valorPorLitro, double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    
    
}
