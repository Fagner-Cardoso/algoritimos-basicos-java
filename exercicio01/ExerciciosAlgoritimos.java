
package edu.fagner.exercicios.exercicio01;

/**
 *
 * @author fagner-cardoso
 */
public class ExerciciosAlgoritimos {

    public static void main(String[] args) {

    //1. Criar um array de inteiros e imprimir todos elementos 

    int [] arr = {7,3,5,9,12,18,22,25}; 

    //chamada do método imprimirElementoArrays

    imprimirElementosArray(arr);

    }

//método de classe para impressão dos arrays 
static void imprimirElementosArray(int[] arr){
    
    for(int index : arr){
        System.out.println(index);
    }
     
}

}
