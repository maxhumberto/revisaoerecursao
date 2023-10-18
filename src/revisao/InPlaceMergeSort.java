package revisao;

import java.util.Random;

public class InPlaceMergeSort {
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
                inPlaceMergeSort(mergeSortArray);
                mergeSortTotalComparisons += comparisonCount;
            }

            long mergeSortAverageComparisons = mergeSortTotalComparisons / numberOfTests;

            System.out.println("Array Size: " + size);
            System.out.println("In-Place Merge Sort Average Comparisons: " + mergeSortAverageComparisons);
            System.out.println();
        }
    }

    public static void preencheAleatorio(int[] v, int max) {
        Random r = new Random();
        for (int i = 0; i < v.length; i++)
            v[i] = r.nextInt(max + 1);
    }

    public static void inPlaceMergeSort(int[] arr) {
        int n = arr.length;
        for (int currSize = 1; currSize <= n - 1; currSize = 2 * currSize) {
            for (int leftStart = 0; leftStart < n - 1; leftStart += 2 * currSize) {
                int mid = Math.min(leftStart + currSize - 1, n - 1);
                int rightEnd = Math.min(leftStart + 2 * currSize - 1, n - 1);
                merge(arr, leftStart, mid, rightEnd);
            }
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int[] leftArray = new int[leftSize];
        int[] rightArray = new int[rightSize];

        for (int i = 0; i < leftSize; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int i = 0; i < rightSize; i++) {
            rightArray[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;

        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            comparisonCount++; // Contabilize a comparação aqui
            k++;
        }

        while (i < leftSize) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightSize) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
