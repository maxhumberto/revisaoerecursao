package revisao;

public class MediaAritmeticaArredondada {

	public static void main(String[] args) {
		int[] a = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
        int[] b = new int[1]; 
        
        int soma = 0;
        for (int i = 0; i < a.length; i++) {
            soma += a[i];
        }
        int media = soma / a.length; 
        b[0] = media;

        System.out.println("A média aritmética dos elementos de a é: " + b[0]);
    }
}