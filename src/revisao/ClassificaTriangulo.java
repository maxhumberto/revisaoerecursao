package revisao;
import java.util.Scanner;

public class ClassificaTriangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


        System.out.println("Digite os três lados do triângulo:");
        System.out.print("Lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Lado 3: ");
        double lado3 = scanner.nextDouble();

        if (formaTriangulo(lado1, lado2, lado3)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triângulo Equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo Isósceles");
            } else {
                System.out.println("Triângulo Escaleno");
            }
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        scanner.close();
    }

    public static boolean formaTriangulo(double a, double b, double c) {
        return (a > 0 && b > 0 && c > 0) && (a + b > c && a + c > b && b + c > a);
    }
}
