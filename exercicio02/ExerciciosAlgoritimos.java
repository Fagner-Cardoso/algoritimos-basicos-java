
package edu.fagner.exercicios.exercicio02;

/**
 *
 * @author fagner-cardoso
 */
public class ExerciciosAlgoritimos {

    public static void main(String[] args) {

    //2. Criar um array de Strings e imprimir todos elementos 

    String [] arr = {"Brasil","Itália","Portugal","México","China"}; 

    //chamada do método imprimirElementoArrays

    imprimirElementosArray(arr);

    }

//método de classe para impressão dos arrays 
static void imprimirElementosArray(String[] arr){
    
    for(int index = 0; index < arr.length; index++){
        System.out.println(arr[index]);
    }
     
}

}
