/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenacion2020;

import java.util.Arrays;

/**
 *
 * @author Alberto
 */
public class AlgoritmosOrdenacion2020 {

    int[] lista1 = {13,24,65,3,86,11};

    public void ordenacionBurbuja(int[] numeros) {
        //El metodo recibe un array de numeros
        //y lo ordenara mediante el algoritmo de la burbuja
        for (int j = 0; j < numeros.length; j++) {
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    //Si se cumple intercambio los valores de i e i+1
                    int aux = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = aux;
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlgoritmosOrdenacion2020 algoritmo = new AlgoritmosOrdenacion2020();
        System.out.println("lista no ordenada:" + Arrays.toString(algoritmo.lista1));
        algoritmo.ordenacionBurbuja(algoritmo.lista1);
        System.out.println("lista ordenada:" + Arrays.toString(algoritmo.lista1));
    }

}
