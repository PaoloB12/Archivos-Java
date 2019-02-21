/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author pbeni
 */
public class EscrituraBuffer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String direccion = "archi.pao";
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter(direccion));
            output.write("hola");
            output.newLine();
            output.write("chau");
            output.write("cosa");
            output.append("otra");
            output.close();
            
          
        } catch (Exception e) {
        }
    }

}
