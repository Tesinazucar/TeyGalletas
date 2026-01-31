package com.mycompany.curso;
import java.util.Scanner;
public class Curso {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Primera cadena: ");
        String primera = sc.nextLine();
        System.out.println("Segunda cadena: ");
        String segunda = sc.nextLine();
        
        if (primera.equals(segunda)) {
            System.out.println("Las cadenas son iguales");
        } else {
            System.out.println("Diferentes");
        }
        
        if (primera.equals("Primera cadena")){
            System.out.println("Eres tontisimo");
        }
        
    }
}
