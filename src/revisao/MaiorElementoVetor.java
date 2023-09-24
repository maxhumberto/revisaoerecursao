package revisao;

public class MaiorElementoVetor {

	public static void main(String[] args) {
		int[] a = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
        int[] b = new int[a.length]; 

        // Encontra o maior elemento em a e atribui a b[0]
        int maior = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maior) {
                maior = a[i];
            }
        }
        b[0] = maior;

        // Exibe o vetor b
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}