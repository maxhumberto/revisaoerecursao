package revisao;

public class NumerosIndicesPares {

	public static void main(String[] args) {
		int[] a = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
        int[] b;

        int tamanhoB = (int) Math.ceil(a.length / 2.0);
        b = new int[tamanhoB];

        int j = 0; 
        for (int i = 0; i < a.length; i += 2) {
            b[j] = a[i];
            j++;
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}