package com.exercicios.poo;
public class Invoice {
    /*
        6. Crie uma classe chamada Invoice que possa ser utilizado por uma loja 
        de suprimentos de informática para representar uma fatura de um item 
        vendido na loja. Uma fatura deve incluir as seguintes informações como 
        atributos:
        
        a. o número do item faturado,
        b. a descrição do item,
        c. a quantidade comprada do item e
        d. o preço unitário do item.
        
        Sua classe deve ter um construtor que inicialize os quatro atributos. 
        Se a quantidade não for positiva, ela deve ser configurada como 0. Se o 
        preço por item não for positivo ele deve ser configurado como 0.0. 
        Forneça os métodos getters e setters para cada variável de instância. 
        Além disso, forneça um método chamado getInvoiceAmount que calcula o 
        valor da fatura (isso é, multiplica a quantidade pelo preço por item) e 
        depois retorna o valor como um double. Escreva um aplicativo de teste 
        que demonstra as capacidades da classe Invoice.
        */
    
    private int numeroItem;
    private String descricaoItem;
    private int quantidadeComprada;
    private double precoUnitario;

    public int getNumeroItem(){
        return this.numeroItem;
    }
    
    public void setNumeroItem(int numeroItem){
        this.numeroItem = numeroItem;
    }
    
    public String getDescricaoItem(){
        return this.descricaoItem;
    }
    
    public void setDescricaoItem(String descricaoItem){
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    public Invoice(int numeroItem, String descricaoItem, int quantidadeComprada,
            double precoUnitario){
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        if(quantidadeComprada < 0){
            this.quantidadeComprada = 0;
        } else{
            this.quantidadeComprada = quantidadeComprada;
        }
        if(precoUnitario >= 0.0){
            this.precoUnitario = precoUnitario;
        } else {
            this.precoUnitario = 0.0;
        }
        
    }
    
    public double getInvoiceAmount(){
        return this.quantidadeComprada * this.precoUnitario;
    }
    
    
}
