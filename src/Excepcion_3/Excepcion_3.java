package Excepcion_3;

import java.io.*;

/**
 * Try Catch para Excepciones Verificadas
 * */
public class Excepcion_3 {

    public void leerArchivo() throws FileNotFoundException, IOException {
        File archivo = new File("C:\\Users\\galvi\\Documents\\Excepciones\\TextoPrueba1.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;

        while((linea = bf.readLine()) != null){
            System.out.println(linea);
        }
    }

    public void leerArchivo2(){
        try {
            leerArchivo();
        } catch (FileNotFoundException e) {
            System.out.println("Error Archivo --> "+e);
        } catch (IOException er){
            System.out.println("Error General --> "+er);
        }
        System.out.println("\nPrograma terminado");
    }

    public static void main(String[] args) throws IOException {
        Excepcion_3 exc = new Excepcion_3();
        exc.leerArchivo2();
    }
}
