package com.mycompany.primerosejercicios;
public class FizzBuzz {
public static void main(String[] args) {
           /*
         * Escribe un programa que muestre por consola (con un print) los
         * números de 1 a 100 (ambos incluidos y con un salto de línea entre
         * cada impresión), sustituyendo los siguientes:
         * - Múltiplos de 3 por la palabra "fizz".
         * - Múltiplos de 5 por la palabra "buzz".
         * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
         */
           
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
