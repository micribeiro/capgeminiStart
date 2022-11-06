package com.exercicios.poo;

import java.util.Date;

public class Pessoa {
    /*
        1. Crie uma classe para representar uma Pessoa com os atributos privados 
        de nome, data de nascimento e altura. Crie os métodos públicos 
        necessários para getters e setters e também um método para imprimir 
        todos dados de uma pessoa. Crie um método para calcular a idade da 
        pessoa.
        */
        
    private String nome;
    private Date dataNascimento;
    private int altura;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public Date getDataNascimento(){
        return dataNascimento;
    }
    
    public void setDataNascimento (Date dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", dataNascimento=" + dataNascimento + ", altura=" + altura + '}';
    }
    
    /*
    public int calcularIdade (){
        return 0 ;
    }
    */
}
