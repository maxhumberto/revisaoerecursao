package revisao;

public class IndicesElementosMaioresQue50 {

	public static void main(String[] args) {
		int[] a = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
        int[] b;

        
        int contadorMaioresQue50 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 50) {
                contadorMaioresQue50++;
            }
        }

       
        b = new int[contadorMaioresQue50];

        
        int j = 0; 
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 50) {
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