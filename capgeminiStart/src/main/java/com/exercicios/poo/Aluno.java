package com.exercicios.poo;
public class Aluno {
    /*
        5. Escreva uma classe cujos objetos representam alunos matriculados em 
        uma disciplina. Cada objeto dessa classe deve guardar os seguintes dados 
        do aluno: matrícula, nome, 2 notas de prova e 1 nota de trabalho. 
        Escreva os seguintes métodos para esta classe: 
        
        a. media: calcula a média final do aluno (cada prova tem peso 2,5 e 
        o trabalho tem peso 2) 
        b. final: calcula quanto o aluno precisa para a prova final (retorna 
        zero se ele não for para a final)
    */
    
    private int matricula = 0;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;
    
    public Aluno(String nome){
        this.matricula = matricula + 1;
        this.nome = nome;
    }
    
    public double media(){
        return ((2.5*(notaProva1 + notaProva2)+2*notaTrabalho)/7);
    }
    
    public double pontosFaltantes(){
        if(media() < 7){
            return 7 - media();
        }else{
            return 0;
        }
        
    }
    
    
    
}
