package revisao;

import java.util.Scanner;

	public class MenorValor {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("Digite o primeiro valor: ");
			double valor1 = sc.nextDouble();

			System.out.print("Digite o segundo valor: ");
			double valor2 = sc.nextDouble();

			System.out.print("Digite o terceiro valor: ");
			double valor3 = sc.nextDouble();

			System.out.print("Digite o quarto valor: ");
			double valor4 = sc.nextDouble();

			double menorValor = encontrarMenor(valor1, valor2, valor3, valor4);

			System.out.println("O menor valor é: " + menorValor);

        sc.close();
    }

	public static double encontrarMenor(double a, double b, double c, double d) {
        double menor = a;

        if (b < menor) {
            menor = b;
        }

        if (c < menor) {
            menor = c;
        }

        if (d < menor) {
            menor = d;
        }

        return menor;
    }
}