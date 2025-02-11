package tema8_Almacenamiento;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EjercicioBufferedWriter {

    public static void main(String[] args) {
        String nombre = "FicheroDePrueba.txt";
        int lineas = 5;
        crearFichero(nombre, lineas);
        leerFichero(nombre);

    }

    public static void crearFichero(String nombre, int lineas) {
        try {

            FileWriter fw = new FileWriter(nombre);
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                for (int i = 1; i <= lineas; i++) {
                    bw.write("Esta es la linea " + i);
                    bw.newLine();
                }
            }

            System.out.println("El fichero: " + nombre + " se ha creado con " + lineas + " lineas.");

        } catch (IOException e) {
            System.out.println("La has liado otra vez " + e.getMessage());
        }

    }

    public static void leerFichero(String nombre) {
        try {
            int palabras = 0;
            FileReader fr = new FileReader(nombre);
            try (BufferedReader br = new BufferedReader(fr)) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] palabrasLinea = linea.split("\\s+");
                    palabras+= palabrasLinea.length;
                }
                // Al cerrar el BufferedReader también se cierra el FileReader
            }
            System.out.println("El fichero: "+nombre+" contiene "+palabras+" palabras.");

        } catch (IOException e) {
            System.out.println("Da problemas con la lectura "+e.getMessage());
        }
    }

}
