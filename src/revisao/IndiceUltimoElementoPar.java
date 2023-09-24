package revisao;

public class IndiceUltimoElementoPar {

	public static void main(String[] args) {
		int[] a = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
        int[] b = new int[1]; 
        
        b[0] = -1;

        
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 == 0) { 
                b[0] = i;
                break; 
            }
        }

        
        System.out.println("O índice do último elemento par de a é: " + b[0]);
    }
}
