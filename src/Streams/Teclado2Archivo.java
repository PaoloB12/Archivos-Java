/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author pbeni
 */
public class Teclado2Archivo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String path = "teclado.pao";
        System.out.println("INGRESE ORACION");
        String oracion = teclado.nextLine();
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter(path));
            output.append(oracion);
            output.close();
            
        } catch (Exception e) {
            System.out.println("BOOM");
        }
    }
}



