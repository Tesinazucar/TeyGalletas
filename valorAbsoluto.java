package com.mycompany.curso;
import java.util.Scanner;

public class valorAbsoluto {
    
    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el numero: ");
        int num = sc.nextInt();
        
        if (num < 0) {
            System.out.println("Resultado: " + (num * -1));
        } else {
            System.out.println(num);
        }
         
        
    }
}
