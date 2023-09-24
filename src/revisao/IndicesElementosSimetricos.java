package revisao;

public class IndicesElementosSimetricos {

	public static void main(String[] args) {
		int[] a = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
        int[] b;

        int contadorSimetricos = 0;
        int tamanhoA = a.length;
        for (int i = 0; i < tamanhoA / 2; i++) {
            int indiceSimetrico = tamanhoA - 1 - i;
            if (a[i] == a[indiceSimetrico]) {
                contadorSimetricos++;
            }
        }

        b = new int[contadorSimetricos];

        
        int j = 0; 
        for (int i = 0; i < tamanhoA / 2; i++) {
            int indiceSimetrico = tamanhoA - 1 - i;
            if (a[i] == a[indiceSimetrico]) {
                b[j] = i;
                j++;
            }
        }

        
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}