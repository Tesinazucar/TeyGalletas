package com.mycompany.curso;

import java.util.Scanner;

public class comparandoNumeros {
    
     public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
     
        System.out.println("Dime el primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.println("Dime el segundo numero: ");
        int num2 = sc.nextInt();
        
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        } else if (num1 == num2){
            System.out.println(num1 + " es igual que " + num2); 
        } else { 
            System.out.println(num2 + " es mayor que " + num1);
        }
        
     }
}
