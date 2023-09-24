package revisao;

public class SomaElementosImpares {

	public static void main(String[] args) {
		int[] a = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
        int[] b = new int[1]; 
        
        int somaImpares = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) { 
                somaImpares += a[i];
            }
        }

        
        b[0] = somaImpares;

        
        System.out.println("A soma dos elementos ímpares de a é: " + b[0]);
    }
}