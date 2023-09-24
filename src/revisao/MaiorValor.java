package revisao;
import java.util.Scanner;

public class MaiorValor {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro valor: ");
	        double valor1 = scanner.nextDouble();

	        System.out.print("Digite o segundo valor: ");
	        double valor2 = scanner.nextDouble();

	        double maiorValor = valor1 > valor2 ? valor1 : valor2;

	        System.out.println("O maior valor é: " + maiorValor);

	        scanner.close();


	}

}
