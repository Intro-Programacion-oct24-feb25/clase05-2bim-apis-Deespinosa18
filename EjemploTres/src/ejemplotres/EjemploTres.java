/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotres;

import org.apache.commons.lang3.math.NumberUtils;

/**
 *
 * @author reroes
 */
public class EjemploTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String[] dataInicial = {"100", "90", "1n", "10", "H1", "H2"}; 
           int [] dataFinal = new int [6];
         for (int i = 0; i < dataInicial.length; i++) {
             dataFinal[i] = NumberUtils.toInt(dataInicial[i]);
            
        }
         for (int i = 0; i <dataFinal.length; i++) {
             System.out.println(dataFinal[i]);
        }
    }
}
