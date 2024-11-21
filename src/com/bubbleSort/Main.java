package com.bubbleSort;

public class Main {

    public static void main(String[] args) {

        int[] vetor = new int[10];

        // Preenchendo o vetor
        System.out.println("Vetor Desordenado:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            System.out.print(vetor[i] + " ");
        }

        // Usando o método Bubble Sort
        // para ordena o vetor desordenado
        int aux = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
        // A complexidade desse algoritmo e O(n^2)

        // exibir o vetor ordenado
        System.out.println("\nVetor Ordenado:");
        for (int i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
}
