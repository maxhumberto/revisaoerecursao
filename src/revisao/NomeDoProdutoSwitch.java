package revisao;
import java.util.Scanner;
public class NomeDoProdutoSwitch {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Digite o código do produto: ");
	        int codigo = sc.nextInt();

	        String nomeProduto;

	        switch (codigo) {
	            case 1:
	                nomeProduto = "Parafuso";
	                break;
	            case 2:
	                nomeProduto = "Porca";
	                break;
	            case 3:
	                nomeProduto = "Prego";
	                break;
	            default:
	                nomeProduto = "Diversos";
	                break;
	        }

	        System.out.println("O produto correspondente ao código " + codigo + " é: " + nomeProduto);

	        sc.close();
	    }
	}
