package revisao;
import java.util.Scanner;


public class CalculoTroco {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor pago: R$ ");
        double valorPago = scanner.nextDouble();

        System.out.print("Digite o preço do produto: R$ ");
        double precoProduto = scanner.nextDouble();

        double troco;

        if (valorPago >= precoProduto) {
            troco = valorPago - precoProduto;
            System.out.println("Troco a ser dado: R$ " + troco);
        } else {
            System.out.println("Valor pago insuficiente. Faltam R$ " + (precoProduto - valorPago));
        }

        scanner.close();
    }
}
