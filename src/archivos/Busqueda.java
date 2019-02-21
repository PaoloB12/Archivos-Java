/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.FileReader;

/**
 *
 * @author pbeni
 */
public class Busqueda {

    public static void main(String[] args) {
        String atajo = "facil.pao";
        int cont = 0;
        try {
            FileReader input = new FileReader(atajo);
            int c;
            do {
               c = input.read();
               if(c==97){
                   cont++;
               }
            } while (c!=-1);
            System.out.printf("EXSITEN %d A'S",cont);
            input.close();
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }

}
