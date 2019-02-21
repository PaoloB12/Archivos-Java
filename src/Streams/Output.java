/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Streams;

import java.io.FileOutputStream;

/**
 *
 * @author pbeni
 */
public class Output {
    public static void main(String[] args) {
        String path = "out.pao";
        byte mensaje[] = {72,111,108,97,32,109,117,110,100,111,46};
        try {
            FileOutputStream output = new FileOutputStream(path);
            output.write(mensaje);
            output.close();
            System.out.println("FIN");
        } catch (Exception e) {
            System.out.println("ERROR");
        }
       
         
        
    }
}
