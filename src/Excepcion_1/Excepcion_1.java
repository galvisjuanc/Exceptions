package Excepcion_1;

import java.util.Scanner;

public class Excepcion_1 {
    public static void main(String[] args) {
        /*
        int num1, num2, resultado;
        num1 = 5;
        num2 = 0;
        resultado = num1 / num2;

        System.out.println("El resultado es: "+resultado);
        // La división por cero genera un ArithmeticException. El programa se totea en la operación de resultado
        */
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite un número: ");
        numero = entrada.nextInt();
        System.out.println("El número es: "+numero);

        // Un valor incorrecto de la variable genera un InputMismatchException.
    }
}
