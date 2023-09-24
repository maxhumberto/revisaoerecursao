package revisao;

public class IndicesElementosMenoresQue50 {

	public static void main(String[] args) {
		int[] a = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
        int[] b;

        // Conta quantos elementos em a são menores que 50
        int contadorMenoresQue50 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 50) {
                contadorMenoresQue50++;
            }
        }

        // Cria b com o tamanho igual a contadorMenoresQue50
        b = new int[contadorMenoresQue50];

        // Preenche b com os índices de a onde os elementos são menores que 50 (em ordem decrescente)
        int j = 0; // Índice para b
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] < 50) {
                b[j] = i;
                j++;
            }
        }

        // Exibe o vetor b
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
