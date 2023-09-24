package revisao;

public class Entradavetor {

	public static void main(String[] args) {
		 int[] a = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
	        int[] b = new int[a.length]; // Cria um vetor b com o mesmo tamanho de a

	        // Copia os elementos de a para b
	        for (int i = 0; i < a.length; i++) {
	            b[i] = a[i];
	        }

	        // Exibe o vetor b
	        for (int i = 0; i < b.length; i++) {
	            System.out.print(b[i] + " ");
	        }
	    }
}