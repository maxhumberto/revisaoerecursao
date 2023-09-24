package revisao;
import java.util.Scanner;

public class VerificaImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 2 != 0) {
            System.out.println(numero + " é ímpar.");
        } else {
            System.out.println(numero + " não é ímpar.");
        }

        sc.close();
    }
}
