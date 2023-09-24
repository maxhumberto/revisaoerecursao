package revisao;

public class MaiorESegundoMaiorElemento {

	public static void main(String[] args) {
		int[] a = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
        int[] b = new int[2]; 
        
        b[0] = a[0];
        b[1] = a[1];

        
        for (int i = 2; i < a.length; i++) {
            if (a[i] > b[0]) {
                b[1] = b[0]; 
                b[0] = a[i]; 
            } else if (a[i] > b[1] && a[i] != b[0]) {
                b[1] = a[i]; 
            }
        }

        
        System.out.println("O maior elemento de a é: " + b[0]);
        System.out.println("O segundo maior elemento de a é: " + b[1]);
    }
}