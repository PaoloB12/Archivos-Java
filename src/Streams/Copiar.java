/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author pbeni
 */
public class Copiar {

    public static void main(String[] args) {
        String path = "facil.pao";
        String oracion;
        try {
            BufferedReader input = new BufferedReader(new FileReader(path));
            BufferedWriter output = new BufferedWriter(new FileWriter("facil(1).pao"));
            do {
                oracion = input.readLine();
                if (oracion != null) {
                    output.write(oracion);
                    output.newLine();
                }
            } while (oracion != null);
            output.close();
            input.close();
            System.out.println("COPIADO EXITOSAMENTE");
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
