package revisao;

public class MenorIndiceElementoVetor {
	public static void main(String[] args) {
        int[] a = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
        int[] b = new int[1]; 
        
        int menor = a[0];
        int indiceMenor = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < menor || (a[i] == menor && i < indiceMenor)) {
                menor = a[i];
                indiceMenor = i;
            }
        }

        b[0] = indiceMenor;

       
        System.out.println("O índice do menor elemento de a é: " + b[0]);
    }
}
