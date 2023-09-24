package revisao;
import java.util.Scanner;

public class CalculaMediaEExibeMenores {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);

	        int tamanho = 5;
	        int[] vetor = new int[tamanho];

	        // Recebe os 50 números inteiros
	        for (int i = 0; i < tamanho; i++) {
	            System.out.print("Digite o número " + (i + 1) + ": ");
	            vetor[i] = scanner.nextInt();
	        }

	        // Calcula a média aritmética
	        double soma = 0;
	        for (int i = 0; i < tamanho; i++) {
	            soma += vetor[i];
	        }
	        double media = soma / tamanho;

	        System.out.println("Média aritmética: " + media);

	        // Exibe os valores menores que a média
	        System.out.println("Valores menores que a média:");
	        for (int i = 0; i < tamanho; i++) {
	            if (vetor[i] < media) {
	                System.out.println(vetor[i]);
	            }
	        }

	        scanner.close();
	    }
	}