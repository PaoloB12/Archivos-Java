/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author pbeni
 */
public class Buffers {

    public static void main(String[] args) {
        String ruta = "facil.pao";
        try {
            BufferedReader input = new BufferedReader(new FileReader(ruta));
            String atajo;
            do {
                atajo = input.readLine();
                if (atajo != null) {
                    System.out.println(atajo);
                }
            } while (atajo != null);
            input.close();
        } catch (Exception e) {
            System.out.println("ERROR ");
        }
    }
}
