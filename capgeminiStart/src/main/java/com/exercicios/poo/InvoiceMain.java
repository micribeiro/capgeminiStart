package com.exercicios.poo;
public class InvoiceMain {
    public static void main(String[] args) {
        
        //Programa de teste da classe Invoice
        
        Invoice invoice01 = new Invoice(1,"Biscoito recheado "
                + "Richester",50,2.5);
        
        System.out.println("Descrição: " + invoice01.getDescricaoItem());
        System.out.println("Preço: " + invoice01.getPrecoUnitario());
        
        invoice01.setDescricaoItem("Biscoito Bono 100g");
        System.out.println("Descrição: " + invoice01.getDescricaoItem());
        
        System.out.println(invoice01.getInvoiceAmount());
        
    }
    
}
