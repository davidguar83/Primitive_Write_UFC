/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivewriteutf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author david
 */
public class PrimitiveWriteUTF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            DataInputStream ler = new DataInputStream(new FileInputStream("C:/Users/david/Desktop/prueba clase file/texto3.txt"));
            DataOutputStream escribir = new DataOutputStream(new FileOutputStream("C:/Users/david/Desktop/prueba clase file/texto3.txt"));

            for (int i = 0; i < 3; i++) {

                String a = "o tempo esta xélido ";

                System.out.println("escribiendo a cadea: " + a);
                escribir.writeUTF(a);
                System.out.println("tamaño do ficheiro: " + escribir.size() + " bytes");

            }

            System.out.println("tamaño final do ficheiro: " + escribir.size() + " bytes");

            while (ler.available() != 0) {

                for (int j = 0; j < 3; j++) {

                    System.out.println("quedan: "+ler.available()+ " bytes por leer");
                    System.out.println("cadea: "+ler.readUTF());

                }
            }

            if (ler.available() == 0) {
                System.out.println("Xa no queda nada por ler");
            }

        } catch (IOException e) {
            System.out.println("Error");;
        }

    }

}
