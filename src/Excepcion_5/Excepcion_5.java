package Excepcion_5;

import Excepcion_3.Excepcion_3;

import javax.swing.*;

/**
 * Try Catch para excepciones no verificadas
 * */
public class Excepcion_5 {
    public void operaciones(){
        int num1 = 2;
        int num2 = 0;
        int resultado;

        resultado = num1 / num2;
        System.out.println("El resultado es: "+resultado);
    }

    public void operaciones2(){
        try{
            operaciones();
        } catch (ArithmeticException a){
            JOptionPane.showMessageDialog(null, "Ha intentado dividir un número entero por cero. Eso es un error");
        }
        System.out.println("\nPrograma Terminado");
    }

    public static void main(String[] args) {
        Excepcion_5 ex5 = new Excepcion_5();

        ex5.operaciones2();
    }
}
