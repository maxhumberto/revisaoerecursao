package revisao;

import java.util.Random;

public class InvertedMergeSort {
	 static long comparisonCount = 0;

	    public static void main(String[] args) {
	        int[] sizes = {100, 500, 1000, 5000, 10000};
	        int maxRandomValue = 10000;
	        int numberOfTests = 100;

	        for (int size : sizes) {
	            long mergeSortTotalComparisons = 0;

	            for (int i = 0; i < numberOfTests; i++) {
	                int[] randomArray = new int[size];
	                preencheAleatorio(randomArray, maxRandomValue);

	                int[] mergeSortArray = randomArray.clone();
	                comparisonCount = 0;
	                invertedMergeSort(mergeSortArray, 0, mergeSortArray.length - 1);
	                mergeSortTotalComparisons += comparisonCount;
	            }

	            long mergeSortAverageComparisons = mergeSortTotalComparisons / numberOfTests;

	            System.out.println("Array Size: " + size);
	            System.out.println("Inverted Merge Sort Average Comparisons: " + mergeSortAverageComparisons);
	            System.out.println();
	        }
	    }

	    public static void preencheAleatorio(int[] v, int max) {
	        Random r = new Random();
	        for (int i = 0; i < v.length; i++)
	            v[i] = r.nextInt(max + 1);
	    }

	    public static void invertedMergeSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int mid = (low + high) / 2;

	            invertedMergeSort(arr, mid + 1, high); // Chama recursão no lado direito primeiro
	            invertedMergeSort(arr, low, mid);

	            merge(arr, low, mid, high);
	        }
	    }

	    private static void merge(int[] arr, int low, int mid, int high) {
	        int[] temp = new int[arr.length];

	        for (int i = low; i <= high; i++) {
	            temp[i] = arr[i];
	            comparisonCount++; // Contabilize a comparação aqui
	        }

	        int i = low;
	        int j = mid + 1;
	        int k = low;

	        while (i <= mid && j <= high) {
	            if (temp[i] <= temp[j]) {
	                arr[k++] = temp[i++];
	            } else {
	                arr[k++] = temp[j++];
	            }
	            comparisonCount++; // Contabilize a comparação aqui
	        }

	        while (i <= mid) {
	            arr[k++] = temp[i++];
	            comparisonCount++; // Contabilize a comparação aqui
	        }
	    }
	}