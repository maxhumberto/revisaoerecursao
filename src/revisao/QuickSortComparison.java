package revisao;
import java.util.Random;

public class QuickSortComparison {
	static long comparisonCount = 0;

	   public static void main(String[] args) {
	        int[] sizes = {100, 500, 1000, 5000, 10000};
	        int maxRandomValue = 10000;
	        int numberOfTests = 100;

	        for (int size : sizes) {
	            long quickSortTotalComparisons = 0;

	            for (int i = 0; i < numberOfTests; i++) {
	                int[] randomArray = new int[size];
	                preencheAleatorio(randomArray, maxRandomValue);

	                int[] quickSortArray = randomArray.clone();
	                comparisonCount = 0; // Reset the comparison count
	                quickSort(quickSortArray, 0, quickSortArray.length - 1);
	                quickSortTotalComparisons += comparisonCount;
	            }

	            long quickSortAverageComparisons = quickSortTotalComparisons / numberOfTests;

	            System.out.println("Array Size: " + size);
	            System.out.println("Quick Sort Average Comparisons: " + quickSortAverageComparisons);
	            System.out.println();
	        }
	    }

	    public static void preencheAleatorio(int[] v, int max) {
	        Random r = new Random();
	        for (int i = 0; i < v.length; i++)
	            v[i] = r.nextInt(max + 1);
	    }

	    public static void quickSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(arr, low, high);
	            quickSort(arr, low, pivotIndex - 1);
	            quickSort(arr, pivotIndex + 1, high);
	        }
	    }

	    private static int partition(int[] arr, int low, int high) {
	        int pivot = arr[high];
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (arr[j] <= pivot) {
	                i++;
	                swap(arr, i, j);
	            }
	            comparisonCount++; // Contabilize a comparação aqui
	        }

	        swap(arr, i + 1, high);
	        comparisonCount++; // Contabilize a comparação aqui

	        return i + 1;
	    }

	    private static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	}