package revisao;
import java.util.Scanner;

public class CalculaMediaWhile {

	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);

	        int contador = 0;
	        double soma = 0;

	        while (contador < 50) {
	            System.out.print("Digite um número: ");
	            double numero = sc.nextDouble();
	            soma += numero;
	            contador++;
	        }

	        double media = soma / 50;

	        System.out.println("A média dos 50 números é: " + media);

	        sc.close();
	    }
	}