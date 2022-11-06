package com.exercicios.poo;
public class Elevador {
    /*
        4. Crie uma classe denominada Elevador para armazenar as informações de 
        um elevador dentro de um prédio. A classe deve armazenar o andar atual 
        (térreo = 0), total de andares no prédio (desconsiderando o térreo), 
        capacidade do elevador e quantas pessoas estão presentes nele. A classe 
        deve também disponibilizar os seguintes métodos:

        a. Inicializa: que deve receber como parâmetros a capacidade do elevador 
        e o total de andares no prédio (os elevadores sempre começam no térreo 
        e vazio);
        b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar 
        se ainda houver espaço);
        c. Sai: para remover uma pessoa do elevador (só deve remover se houver 
        alguém dentro dele);
        d. Sobe: para subir um andar (não deve subir se já estiver no último 
        andar);
        e. Desce: para descer um andar (não deve descer se já estiver no 
        térreo);
        */
    
    int andarAtual;
    int totalAndares;
    int capacidadeElevador;
    int pessoasNoElevador;
    
    public Elevador(int capacidadeElevador, int totalAndares){
        this.capacidadeElevador = capacidadeElevador;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasNoElevador = 0;
    }
    
    public void entra(){
        if(this.capacidadeElevador > this.pessoasNoElevador){
            this.pessoasNoElevador++;
        } else{
            System.out.println("Elevador lotado!");
        }
    }
    
    public void sai(){
        if(this.pessoasNoElevador > 0){
            this.pessoasNoElevador--;
        } else{
            System.out.println("Elevador vazio!");
        }
    }
    
    public void sobe(){
        if(this.andarAtual == this.totalAndares){
            System.out.println("Estamos no último andar.");
        } else {
            this.andarAtual++;
        }
    }
    
    public void desce(){
        if(this.andarAtual == 0){
            System.out.println("Estamos no térreo andar.");
        } else {
            this.andarAtual--;
        }
    }
}
