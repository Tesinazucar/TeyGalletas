package com.mycompany.curso;

import java.util.Scanner;
public class Primer {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    
            
        /* Definir variables */
        System.out.println("Escribe el valor");
        int valor = sc.nextInt();
        
        if (valor == 1000000 ) {
            System.out.println("Debes pagar: " + (142100 + (valor - 1000000) * 0.17));
            
        } else if ((valor >= 200000) && (valor <= 1000000) ){
            System.out.println("Debes pagar: " + (22100 + (valor - 200000) * 0.15)); 
                    
        } else if ((valor >= 55000) && (valor <= 200000) ){
            System.out.println("Debes pagar: " + (55000 + (valor - 4700) * 0.12)); 
            
        } else if ((valor >= 25000) && (valor <= 55000) ){
            System.out.println("Debes pagar: " + (25000 + (valor - 1700) * 0.10));
            
        } else if ((valor >= 5000) && (valor <= 25000) ){
            System.out.println("Debes pagar: " + (5000 + (valor - 100) * 0.08));
            
        } else {
            System.out.println("Sin impuestos.");
        }
            
        }
}
        
            
        

    

