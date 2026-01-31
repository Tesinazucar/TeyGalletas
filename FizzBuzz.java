package com.mycompany.primerosejercicios;
public class FizzBuzz {
public static void main(String[] args) {

       int i;
        for (i = 1; i <= 100; i++) {
            boolean divisibleByThree = i % 3 == 0;
            boolean divisibleByFive = i % 5 == 0;
            if (divisibleByFive && divisibleByThree) {
                System.out.println("fizzbuzz");
            } else if (divisibleByFive) {
                System.out.println("buzz");
            } else if (divisibleByThree) {
                System.out.println("fizz");
            } else {
                System.out.println("Ninguno de los dos es correcto");
            }
        }
}    }
