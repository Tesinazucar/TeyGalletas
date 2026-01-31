
package com.mycompany.curso;
import java.util.Scanner;
public class bucleDameUnNumero {
    public static void main (String[] main){
     Scanner sc = new Scanner(System.in); 
     
     while (true){
         System.out.println("Dame un numero: ");
         int num = Integer.valueOf(sc.nextLine());
         if (num == 4){
             break;
         }
         System.out.println("El numero es " + num);
     }
     
    }
}
