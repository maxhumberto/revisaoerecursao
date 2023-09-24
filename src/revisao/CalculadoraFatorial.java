package revisao;

public class CalculadoraFatorial {

	public static void main(String[] args) {
		int numero = 5; // Altere o número aqui
        long resultado = calcularFatorial(numero);
        System.out.println("O fatorial de " + numero + " é " + resultado);
    }

    
    public static int calcularFatorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}