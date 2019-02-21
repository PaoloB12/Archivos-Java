/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author pbeni
 */
public class BaseDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre[] = new String[5];
        int opcion;
        System.out.println("ELIJA OPCION");
        System.out.println("1: RECUPERAR NOMBRES");
        System.out.println("2: INGRESAR NOMBRES NUEVOS");
        opcion = teclado.nextInt();
        switch (opcion) {
            case 1:
                try {
                    BufferedReader input = new BufferedReader(new FileReader("BD.pao"));
                    for (int i = 0; i < 5; i++) {
                        nombre[i] = input.readLine();
                    }
                    input.close();
                } catch (Exception e) {
                    System.out.println("ERROR AL LEER");
                }
                for (int i = 0; i < 5; i++) {
                    System.out.printf("%s\n",nombre[i]);
                }
                break;
            case 2:
               teclado.nextLine();
                for (int i = 0; i < 5; i++) {
                    System.out.printf("Nombre %d: ", i);
                    nombre[i] = teclado.nextLine();
                }
                try {
                    BufferedWriter output = new BufferedWriter(new FileWriter("BD.pao"));                  
                    for (int i = 0; i < 5; i++) {
                        output.write(nombre[i]);
                        output.write("\r\n");
                    }
                    output.close();

                } catch (Exception e) {
                    System.out.println("ERROR AL ESCRIBIR");
                }
                break;
        }
    }

}
