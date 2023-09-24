package revisao;

public class TorresDeHanoi {

	public static void main(String[] args) {
        int quantidadeDiscos = 3; // Altere a quantidade de discos desejada aqui
        resolverTorresDeHanoi(quantidadeDiscos, 'A', 'C', 'B');
    }

    public static void resolverTorresDeHanoi(int discos, char origem, char destino, char auxiliar) {
        if (discos == 1) {
            System.out.println("Mova o disco 1 de " + origem + " para " + destino);
        } else {
            resolverTorresDeHanoi(discos - 1, origem, auxiliar, destino);
            System.out.println("Mova o disco " + discos + " de " + origem + " para " + destino);
            resolverTorresDeHanoi(discos - 1, auxiliar, destino, origem);
        }
    }
}