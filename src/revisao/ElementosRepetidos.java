package revisao;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;


public class ElementosRepetidos {

	public static void main(String[] args) {
		int[] a = {32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19};

        // Cria um mapa para contar quantas vezes cada elemento aparece em a
        Map<Integer, Integer> contador = new HashMap<>();
        for (int elemento : a) {
            contador.put(elemento, contador.getOrDefault(elemento, 0) + 1);
        }

        // Cria um ArrayList para armazenar os elementos repetidos de a
        ArrayList<Integer> b = new ArrayList<>();
        for (int elemento : a) {
            if (contador.get(elemento) > 1) {
                b.add(elemento);
            }
        }

        // Converte o ArrayList em um vetor
        int[] bArray = new int[b.size()];
        for (int i = 0; i < b.size(); i++) {
            bArray[i] = b.get(i);
        }

        // Exibe o vetor b contendo elementos repetidos
        for (int elemento : bArray) {
            System.out.print(elemento + " ");
        }
    }
}