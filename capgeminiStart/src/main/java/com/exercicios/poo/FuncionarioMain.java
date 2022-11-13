package com.exercicios.poo;
public class FuncionarioMain {

    public static void main(String[] args) {
        /*
        7. 
        Escreva um aplicativo de teste que demonstra as capacidades da classe. 
        Crie duas instâncias da classe e exiba o salário anual de cada 
        instância. Então dê a cada empregado um aumento de 10% e exiba novamente 
        o salário anual de cada empregado.
        */
        
        Funcionario funcionario01 = new Funcionario("Micael",
                "Ribeiro",3590);
        
        Funcionario funcionario02 = new Funcionario("Dylan",
                "Santos",3485);
        
        System.out.printf("Salário anual do " + funcionario01.getPrimeiroNome() 
                + ": R$%.2f\n", (funcionario01.getSalarioMensal()*12));
        System.out.printf("Salário anual do " + funcionario02.getPrimeiroNome() 
                + ": R$%.2f\n", (funcionario02.getSalarioMensal()*12));
        
        System.out.println("-----------------------------------------------");
        
        System.out.println("Após aumento de 10%:");
        
        System.out.printf("Salário anual do " + funcionario01.getPrimeiroNome() 
                + ": R$%.2f\n", (funcionario01.getSalarioMensal()*12)*1.1);
        System.out.printf("Salário anual do " + funcionario02.getPrimeiroNome() 
                + ": R$%.2f", (funcionario02.getSalarioMensal()*12)*1.1);
        
        
    }
    
}
