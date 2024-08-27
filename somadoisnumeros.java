package com.mycompany.hudson;

import java.util.Scanner;

public class NewClass1 {
    
    public static void main(String[] args) {
    
    // INSTANCIA
    Scanner input = new Scanner(System.in);
        
    // VARIAVEIS    
    int n1, n2, res;
    
    // ENTRADA
    System.out.println("Digite valor N1: ");
    n1 = input.nextInt();
    
    System.out.println("Digite valor N2: ");
    n2 = input.nextInt();
    
    // PROCESSAMENTO
    res = n1 + n2;
    
    // SAIDA
    System.out.println("Resposta da Soma: " + res);   
    }
}



