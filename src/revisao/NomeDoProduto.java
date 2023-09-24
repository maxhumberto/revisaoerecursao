package revisao;
import java.util.Scanner;

public class NomeDoProduto {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o código do produto: ");
	        int codigo = sc.nextInt();

	        String nomeProduto;

	        if (codigo == 1) {
	            nomeProduto = "Parafuso";
	        } else if (codigo == 2) {
	            nomeProduto = "Porca";
	        } else if (codigo == 3) {
	            nomeProduto = "Prego";
	        } else {
	            nomeProduto = "Diversos";
	        }

	        System.out.println("O produto correspondente ao código " + codigo + " é: " + nomeProduto);

	        sc.close();
	    }
	}