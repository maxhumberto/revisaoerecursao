package revisao;
import java.util.Scanner;

public class CalculaMediaDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        int contador = 0;
        double soma = 0;

        do {
            System.out.print("Digite um número: ");
            double numero = scanner.nextDouble();
            soma += numero;
            contador++;
        } while (contador < 50);

        double media = soma / 50;

        System.out.println("A média dos 50 números é: " + media);

        scanner.close();
    }
}

