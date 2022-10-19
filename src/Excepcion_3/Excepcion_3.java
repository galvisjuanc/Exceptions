package Excepcion_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Excepcion_3 {

    public void leerArchivo() throws FileNotFoundException {
        File archivo = new File("C:\\Users\\galvi\\Documents\\Excepciones\\TextoPrueba.txt");
        FileReader fr = new FileReader(archivo);
    }

    public void leerArchivo2() throws IOException {
        leerArchivo();
    }

    public static void main(String[] args) {
        //Hi
    }
}
