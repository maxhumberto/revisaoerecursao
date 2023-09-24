package revisao;

public class ElementosPrimos {
	
	 static boolean isPrimo(int numero) {
	        if (numero <= 1) {
	            return false;
	        }
	        for (int i = 2; i * i <= numero; i++) {
	            if (numero % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }

	public static void main(String[] args) {
		int[] a = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
        int[] b;

    
        int contadorPrimos = 0;
        for (int i = 0; i < a.length; i++) {
            if (isPrimo(a[i])) {
                contadorPrimos++;
            }
        }

        b = new int[contadorPrimos];

        
        int j = 0; 
        for (int i = 0; i < a.length; i++) {
            if (isPrimo(a[i])) {
                b[j] = a[i];
                j++;
            }
        }

        
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
	}

}
