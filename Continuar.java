package com.mycompany.curso;


import java.util.Scanner;


public class Continuar {
    public static void main (String[] main){
        Scanner sc = new Scanner(System.in);
    
        while (true){
            System.out.println("Seguimos? ");
            String input = sc.nextLine();
            if (input.equals("no")){
                break;
            }
        }
         System.out.println("Continuemos entonces");
         sc.close();
    }
}
