package com.mycompany.curso;

import java.util.Scanner;

public class NumeroCuadrado {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Introduce el numero para el cuadrado del mismo: ");
        int num = sc.nextInt();
        
        int cuadrado = num * num;
        
        System.out.println("El numero al cuadrado es: " + cuadrado);
        }
}
