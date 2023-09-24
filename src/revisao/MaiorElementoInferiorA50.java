package revisao;

public class MaiorElementoInferiorA50 {

	public static void main(String[] args) {
		int[] a = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
        int[] b = new int[1]; 
        b[0] = 0;

        
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 50 && a[i] > b[0]) {
                b[0] = a[i];
            }
        }

        
        System.out.println("O maior elemento de a inferior a 50 é: " + b[0]);
    }
}