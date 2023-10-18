package revisao;
import java.util.Random;


public class SortComparison {
	static long assignmentCount = 0;

	    public static void main(String[] args) {
	        int[] sizes = {100, 500, 1000, 5000, 10000};
	        int maxRandomValue = 10000;
	        int numberOfTests = 100;

	        for (int size : sizes) {
	            long mergeSortTotalAssignments = 0;

	            for (int i = 0; i < numberOfTests; i++) {
	                int[] randomArray = new int[size];
	                preencheAleatorio(randomArray, maxRandomValue);

	                int[] mergeSortArray = randomArray.clone();
	                assignmentCount = 0; // Reset the assignment count
	                mergeSort(mergeSortArray, 0, mergeSortArray.length - 1);
	                mergeSortTotalAssignments += assignmentCount;
	            }

	            long mergeSortAverageAssignments = mergeSortTotalAssignments / numberOfTests;

	            System.out.println("Array Size: " + size);
	            System.out.println("Merge Sort Average Assignments: " + mergeSortAverageAssignments);
	            System.out.println();
	        }
	    }

	    public static void preencheAleatorio(int[] v, int max) {
	        Random r = new Random();
	        for (int i = 0; i < v.length; i++)
	            v[i] = r.nextInt(max + 1);
	    }

	    public static void mergeSort(int[] arr, int low, int high) {
	        if (low < high) {
	            int mid = (low + high) / 2;

	            mergeSort(arr, low, mid);
	            mergeSort(arr, mid + 1, high);

	            merge(arr, low, mid, high);
	        }
	    }

	    private static void merge(int[] arr, int low, int mid, int high) {
	        int[] temp = new int[arr.length];

	        for (int i = low; i <= high; i++) {
	            temp[i] = arr[i];
	            assignmentCount++; // Contabilize a atribuição aqui
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
	            assignmentCount++; // Contabilize a atribuição aqui
	        }

	        while (i <= mid) {
	            arr[k++] = temp[i++];
	            assignmentCount++; // Contabilize a atribuição aqui
	        }
	    }
	}