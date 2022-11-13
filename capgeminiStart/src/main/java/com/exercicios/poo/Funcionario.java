package com.exercicios.poo;
public class Funcionario {
    /*
        7. A fim de representar funcionários em uma empresa, crie uma classe 
        chamada Funcionario que inclui as três informações a seguir como 
        atributos:
        
        a. um primeiro nome, b. um sobrenome, c. um salário mensal
        
        Sua classe deve ter um *construtor* que inicializa os três atributos. 
        Forneça os métodos *getters e setters* para cada atributo. 
    
        Se o salário mensal não for positivo, configure-o como 0.0. Escreva um 
        aplicativo de teste que demonstra as capacidades da classe. Crie duas 
        instâncias da classe e exiba o salário anual de cada instância. Então dê 
        a cada empregado um aumento de 10% e exiba novamente o salário anual de 
         cada empregado.
        */
    
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;
    
    public Funcionario(String primeiroNome, String sobrenome, double salarioMensal){
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
    }
    
    public String getPrimeiroNome(){
        return this.primeiroNome;
    }
    
    public void setPrimeiroNome(String primeiroNome){
        this.primeiroNome = primeiroNome;
    }
    
    public String getSobrenome(){
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public double getSalarioMensal(){
        return this.salarioMensal;
    }
    
    public void setSalarioMensal(double salarioMensal){
        if(salarioMensal >= 0.0){
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0.0;
        }
    }
}
