package revisao;

import java.util.Scanner;

public class CalculaMediaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador;
        double soma = 0;

        for (contador = 0; contador < 50; contador++) {
            System.out.print("Digite um número: ");
            double numero = sc.nextDouble();
            soma += numero;
        }

        double media = soma / 50;

        System.out.println("A média dos 50 números é: " + media);

        sc.close();
    }
}