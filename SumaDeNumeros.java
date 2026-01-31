
package com.mycompany.curso;

import java.util.Scanner;

public class SumaDeNumeros {
    public static void main (String[] main){
        Scanner sc = new Scanner(System.in);
       //* programa que pide al usuario cinco números y calcula su suma con while*//
       
       int numLeidos = 0;
       int sum = 0;
       
       while (true){
           if (numLeidos == 5) {
               break;
           }
           System.out.println("Dime el numero: ");
           sum = sum + Integer.valueOf(sc.nextLine());
           numLeidos = numLeidos + 1;
       }
       System.out.println("La suma total es = " + sum);
      
       sc.close();
    }
    
}
