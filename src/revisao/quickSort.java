package revisao;
import java.util.Random;

public class quickSort {
	 public static void main(String[] args) {
	        int[] sizes = {100, 500, 1000, 5000, 10000};
	        int maxRandomValue = 10000;
	        int numberOfTests = 100;

	        for (int size : sizes) {
	            long quickSortTotalTime = 0;

	            for (int i = 0; i < numberOfTests; i++) {
	                int[] randomArray = new int[size];
	                preencheAleatorio(randomArray, maxRandomValue);

	                int[] quickSortArray = randomArray.clone();
	                long quickSortTime = measureExecutionTime(() -> quickSort(quickSortArray, 0, quickSortArray.length - 1));
	                quickSortTotalTime += quickSortTime;
	            }

	            long quickSortAverageTime = quickSortTotalTime / numberOfTests;

	            System.out.println("Array Size: " + size);
	            System.out.println("Quick Sort Average Time (ns): " + quickSortAverageTime);
	            System.out.println();
	        }
	    }

	    public static void preencheAleatorio(int[] v, int max) {
	        Random r = new Random();
	        for (int i = 0; i < v.length; i++)
	            v[i] = r.nextInt(max + 1);
	    }

	    public static void quickSort(int[] arr, int low, int high) {
	        // Implementação do Quick Sort
	    }

	    public static long measureExecutionTime(Runnable runnable) {
	        long startTime = System.nanoTime();
	        runnable.run();
	        long endTime = System.nanoTime();
	        return endTime - startTime;
	    }
	}