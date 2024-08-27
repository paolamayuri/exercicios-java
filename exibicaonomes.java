package com.mycompany.hudson;

    import java.util.Scanner;

    public class NewClass4 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String[] nomes = new String[3];
            for (int i=0; i<3; i++){
                System.out.print("Escreva o primeiro nome: ");      //vai pedir 3 nomes
                nomes[i] = scanner.nextLine();                               // vai ler os nomes digitados
            }
            
            for (int i=0; i<3; i++){
                System.out.print(nomes[i]);                      //ira puxar os nomes inseridos no vetor
            }
            //System.out.println(""+nomes[0]);                         //dessa forma é manual            //System.out.println(""+nomes[1]);
            //System.out.println(""+nomes[2]);
        }
    }
