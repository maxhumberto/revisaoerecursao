package revisao;

import java.util.Random;

public class merge {

    public static void preencheAleatorio(int[] v, int max) {
        Random r = new Random();
        for (int i = 0; i < v.length; i++)
            v[i] = r.nextInt(max + 1);
    }

    public static void mergeSort(int[] arr) {
        // Implementação do Merge Sort
    }

    public static long measureExecutionTime(Runnable runnable) {
        long startTime = System.nanoTime();
        runnable.run();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
    
    public static void main(String[] args) {
        int[] sizes = {10, 100, 500, 1000, 5000, 10000};
        int maxRandomValue = 10000;
        int numberOfTests = 100;

        for (int size : sizes) {
            long mergeSortTotalTime = 0;

            for (int i = 0; i < numberOfTests; i++) {
                int[] randomArray = new int[size];
                preencheAleatorio(randomArray, maxRandomValue);

                int[] mergeSortArray = randomArray.clone();
                long mergeSortTime = measureExecutionTime(() -> mergeSort(mergeSortArray));
                mergeSortTotalTime += mergeSortTime;
            }

            long mergeSortAverageTime = mergeSortTotalTime / numberOfTests;

            System.out.println("Array Size: " + size);
            System.out.println("Merge Sort Average Time (ns): " + mergeSortAverageTime);
            System.out.println();
        }
}
}

