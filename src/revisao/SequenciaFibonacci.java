package revisao;

public class SequenciaFibonacci {

	public static void main(String[] args) {
		int posicao = 10; // Altere a posição do termo desejado aqui
        int valor = calcularFibonacci(posicao);
        System.out.println("O termo na posição " + posicao + " da sequência de Fibonacci é " + valor);
    }

   
    public static int calcularFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}  