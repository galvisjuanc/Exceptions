package Excepcion_6;

import java.util.Scanner;

/**
 * Uso de throw para excepciones personalizada
 * */
public class Excepcion_6 {
    private int numero;
    private Scanner entrada;

    public void introducirNumeros() throws CeroExcepcion {
        entrada = new Scanner(System.in);

        do{
            System.out.print("Digite un número: ");
            numero = entrada.nextInt();

            if(numero == 0){
                throw new CeroExcepcion();
            }
        }while(numero != 0 && numero != 1);
    }

    public static void main(String[] args){
        Excepcion_6 ex6 = new Excepcion_6();
        try {
            ex6.introducirNumeros();
        } catch (CeroExcepcion e) {
            System.out.println("Ha introducido el cero. Error fatal! ---> " + e);
        }

        System.out.println("Programa terminado.");
    }
}
