/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.io.FileInputStream;

/**
 *
 * @author pbeni
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String path = "archi.pao";
        try {
            FileInputStream input = new FileInputStream(path);
            int c;
            char letra;
            do {
                c = input.read();
                letra = (char) c;
                System.out.print(letra);              
            } while (c != -1);
            input.close();
            System.out.println("");
        } catch (Exception e) {
            System.out.println("error");
        }
    }

}
