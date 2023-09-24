package revisao;

public class PotenciaRecursiva {

	public static void main(String[] args) {
		int base = 2; 
        int expoente = 3; 
        int resultado = calcularPotencia(base, expoente);
        System.out.println(base + " elevado a " + expoente + " é igual a " + resultado);
    }

    
    public static int calcularPotencia(int base, int expoente) {
        if (expoente == 0) {
            return 1;
        } else {
            return base * calcularPotencia(base, expoente - 1);
        }
    }
}