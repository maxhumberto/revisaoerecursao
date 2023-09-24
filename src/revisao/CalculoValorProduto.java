package revisao;
import java.util.Scanner;

public class CalculoValorProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do quilo do produto: R$ ");
        double valorQuilo = scanner.nextDouble();

        System.out.print("Digite a quantidade de quilos consumida: ");
        double quilosConsumidos = scanner.nextDouble();

        double valorTotal = valorQuilo * quilosConsumidos;

        System.out.println("Valor final a ser pago: R$ " + valorTotal);

        scanner.close();
	}

}
