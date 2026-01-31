package com.mycompany.curso;

import java.util.Scanner;
public class RaizNumerosCuadrados {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el primer numero: ");
        int num1 = sc.nextInt();
        
        System.out.println("Dime el segundo numero: ");
        int num2 = sc.nextInt();
        
        int suma = num1 + num2;
        double raizCuadrada = Math.sqrt(suma);
        
        System.out.println("El numero final seria: " + raizCuadrada);
     }
}
