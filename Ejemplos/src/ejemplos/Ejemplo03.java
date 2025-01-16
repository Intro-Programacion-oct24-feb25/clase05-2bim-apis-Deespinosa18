/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.security.SecureRandom;

// import java.security.*;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {
    
    public static void main(String[] args) {
        int numeroDeElementos = 20;
        int limite = 100;
        int [] valores = obtenerValores (numeroDeElementos, limite);
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("%d\n",valores[i] );
        }
        
    }
    
    public static int obtenerNumero(int limite) {
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();
        
        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        int valorAleatorio = numerosAleatorios.nextInt(limite);
        return valorAleatorio;
    }
    
    public static int obtnerSuma(int a, int b){
        return a + b;
        
    }
    public static int [] obtenerValores(int a, int b){
     
        int [] arreglosAleatorio = new int [a]; 
        for (int i = 0; i < arreglosAleatorio.length; i++) {
            arreglosAleatorio[i] = obtenerNumero(b);
        }
        
        
        return arreglosAleatorio;
    }
}
