package revisao;

import java.util.Scanner;

public class MenorValor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a ,b, c, d, menor;

		System.out.print("Digite o primeiro valor: ");
		a = sc.nextInt();

		System.out.print("Digite o segundo valor: ");
		b = sc.nextInt();

		System.out.print("Digite o terceiro valor: ");
		c = sc.nextInt();

		System.out.print("Digite o quarto valor: ");
		d = sc.nextInt();
		
		if (a < b && a < c && a<d) {
			menor = a;
		} else if (b < a && b < c && b < d) {
			menor = b;
		}else if (c < a && c < b && c < d) {
			menor = c;
		}else {
			menor=d;
		}
		System.out.println("O menor valor é: " + menor);	
		
    sc.close();
}

}
