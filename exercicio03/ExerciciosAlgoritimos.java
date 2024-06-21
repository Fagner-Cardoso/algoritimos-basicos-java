
package edu.fagner.exercicios.exercicio03;

/**
 *
 * @author fagner-cardoso
 */
public class ExerciciosAlgoritimos {

    public static void main(String[] args) {

    //3. Calcular a soma dos elementos de um array de inteiros

    
    // array de inteiros
    int[] inteiros = {20,12,17,19,35,44,52};

    //chamada dos métodos de soma e impressão dos elementos de um array 
    int resultado = calcularSomaElementosArray(inteiros);
    imprimirSomaElementosArray(resultado);

    }

    // método para calcular soma dos elementos de um array
    static int calcularSomaElementosArray(int[] arr)
    {
        int soma = 0;
        for(int index : arr){
            soma += index; 

        }

        return soma; 
    }
    // método para imprimir o resultado da soma dos elementos de um array
    static void imprimirSomaElementosArray(int resultado){
        System.out.println("Soma: "+resultado); 
    }
}
