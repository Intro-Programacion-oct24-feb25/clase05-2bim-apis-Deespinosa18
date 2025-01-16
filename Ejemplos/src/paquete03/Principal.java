/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete04.OperadorUno;
import paquete04.OperadorDos;
import paquete05.OperadorTres;
import paquete06.imprimir;
// import paquete04.*;
/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        int valorA = OperadorUno.obtenerNumero(100);
        int valorB = OperadorUno.obtenerNumero(10);
        int suma = OperadorDos.obtenerSuma(valorA, valorB);
        int multiplicacion = OperadorTres.obtenerMultiplicacion(valorA, 
                                                                valorB);
        /*
        Hacemos importacion de clases para asi poder utilizar codigo de otras clases o 
        proyectos para asi poder aprovecharlos, hacemos el importe mediante el
        nombre del paquete y luego el punto mas el nombre de la clase y hacemos
        el proceso igual que arriba    
        */        
        imprimir.imprimirMensaje(valorA, valorB, suma, multiplicacion);
    }
}
