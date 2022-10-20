package Excepcion_4;

import java.io.*;

/**
* Declaración Excepciones Verificadas
* */

public class Excepcion_4 {

    public static void leerArchivo() throws IOException {
        File archivo = new File("C:\\Users\\galvi\\Documents\\Excepciones\\TextoPrueba.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;

        while((linea = bf.readLine()) != null){
            System.out.println(linea);
        }
    }

    public static void leerArchivo3() throws IOException {
        leerArchivo();
    }

    public static void main(String[] args) throws IOException {
        leerArchivo3();
    }
}
