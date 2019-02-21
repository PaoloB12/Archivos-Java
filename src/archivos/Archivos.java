/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pbeni
 */
public class Archivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "facil.pao";
        try {
            FileReader input = new FileReader(ruta);
            int c;
            do {
                c = input.read();
                char a = (char)c;
               if(c!=-1){
                    System.out.print(a);
               }
            } while (c != -1);
            System.out.println("");
            input.close();
        } catch (Exception e) {
            System.out.println("NO EXISTE");
        }
    }
}
