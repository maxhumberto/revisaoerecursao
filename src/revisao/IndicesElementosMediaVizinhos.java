package revisao;

public class IndicesElementosMediaVizinhos {

	public static void main(String[] args) {
	        int[] a = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};
	        int[] b;

	        int contadorMediaVizinhos = 0;
	        for (int i = 1; i < a.length - 1; i++) { 
	            if (a[i] == (a[i - 1] + a[i + 1]) / 2) {
	                contadorMediaVizinhos++;
	            }
	        }

	        b = new int[contadorMediaVizinhos];

	        
	        int j = 0; 
	        for (int i = 1; i < a.length - 1; i++) { 
	            if (a[i] == (a[i - 1] + a[i + 1]) / 2) {
	                b[j] = i;
	                j++;
	            }
	        }

	        
	        for (int i = 0; i < b.length; i++) {
	            System.out.print(b[i] + " ");
	        }
	    }
	}