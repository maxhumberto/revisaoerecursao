package revisao;

public class OrdenacaoCrescente {
	
	static void ordenarCrescente(int[] a) {
        int tamanho = a.length;
        for (int i = 0; i < tamanho - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < tamanho; j++) {
                if (a[j] < a[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int temp = a[i];
            a[i] = a[indiceMinimo];
            a[indiceMinimo] = temp;
        }
    }	

	public static void main(String[] args) {
		int[] a = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
        int[] b = new int[a.length];

        
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

      
        ordenarCrescente(b);

      
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}