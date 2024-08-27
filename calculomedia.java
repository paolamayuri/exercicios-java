
package com.mycompany.hudson;

import java.util.Scanner;

public class NewClass2 {
    
    public static void main(String[] args) {
    
    // INSTANCIA
    Scanner input = new Scanner(System.in);
        
    // VARIAVEIS    
    double n1, n2, n3, res;
    
    // ENTRADA
    System.out.print("Digite valor N1: ");
    n1 = input.nextDouble();
    
    System.out.print("Digite valor N2: ");
    n2 = input.nextDouble();
    
    System.out.print("Digite valor N3: ");
    n3 = input.nextDouble();
    
    // PROCESSAMENTO
    res = (n1 + n2 + n3)/3;
    
    // SAIDA
    System.out.println("Resposta da Media: " + res);   
    }
}

