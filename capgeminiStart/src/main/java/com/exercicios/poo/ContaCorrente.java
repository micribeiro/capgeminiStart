package com.exercicios.poo;
public class ContaCorrente {
    /*
        2. Crie uma classe para implementar uma ContaCorrente. A classe deve 
        possuir os seguintes atributos: número da conta, nome do correntista e 
        saldo. Os métodos são os seguintes: alterarNome, depósito e saque; No 
        construtor, saldo é opcional, com valor default zero e os demais 
        atributos são obrigatórios.
        */
    
    private int numeroConta;
    private String nomeCorrentista;
    private float saldo;
    
    public void alterarNome(String nomeCorrentista){
        this.nomeCorrentista = nomeCorrentista;
    }
    
    public float deposito(float valor){
        this.saldo = saldo + valor;
        return this.saldo;
    }
    
    public float saque(float valor){
        this.saldo = saldo - valor;
        return this.saldo;
    }
    
    //sobrecarga de métodos para tornar o saldo opcional e o valor default zero
    public ContaCorrente(int numeroConta, String nomeCorrentista, float saldo){
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }
    
    public ContaCorrente(int numeroConta, String nomeCorrentista){
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }
}