package com.mycompany.hudson;
import java.util.Scanner;
import java.text.DecimalFormat;

public class NewClass3 {

    public static void main(String[] args) {
        
        // INSTANCIA
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#, ###.000");
        
        // VARIAVEIS
        double pratica, teorica, trabalho, media;
        
        System.out.print("Valor nota Pratica...: ");
        pratica = input.nextDouble();
        
        System.out.print("Valor nota Teorica...: ");
        teorica = input.nextDouble();
        
        System.out.print("Valor nota Trabalho...: ");
        trabalho = input.nextDouble();
        
        // PROCESSAMENTO
        media = (pratica + teorica + trabalho) / 3;
        
        // SAIDA NORMAL
        System.out.println("Media Final normal...: " + media);
        // SAIDA FORMATADA
        System.out.println("Media Final formatado...: " + df.format(media));
    }
}

