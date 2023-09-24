package revisao;
import java.util.Scanner;

public class ExibeVetorInverso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        // Recebe os 10 valores inteiros
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Valores em ordem inversa:");

        // Exibe os valores em ordem inversa
        for (int i = 9; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        scanner.close();
    }
}