/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileWriter;

/**
 *
 * @author pbeni
 */
public class Escritura {

    public static void main(String[] args) {
        String archivo = "facil2.pao";
        try {
            FileWriter output = new FileWriter(archivo);
            output.write("hola mundo", 5, 5);
            output.close();
        } catch (Exception e) {
            System.out.println("BOOM");
        }
    }
}
