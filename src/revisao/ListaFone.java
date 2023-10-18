package revisao;

public class ListaFone {

	class Node {
        String nome;
        String fone;
        Node link;
    }

    Node l;

    ListaFone() {
        l = null;
    }

    void IncListaFone(String nm, String fn) {
        Node novoNode = new Node();
        novoNode.nome = nm;
        novoNode.fone = fn;
        novoNode.link = l;
        l = novoNode;
    }

    String BuscaFone(String nm) {
        Node current = l;
        while (current != null) {
            if (current.nome.equals(nm)) {
                return current.fone;
            }
            current = current.link;
        }
        return "Nome não encontrado na agenda.";
    }

    void RetListaFone(String nm) {
        if (l == null) {
            return;
        }

        if (l.nome.equals(nm)) {
            l = l.link;
            return;
        }

        Node current = l;
        while (current.link != null) {
            if (current.link.nome.equals(nm)) {
                current.link = current.link.link;
                return;
            }
            current = current.link;
        }
    }

    void listar() {
        Node current = l;
        System.out.println("\nLista:");
        while (current != null) {
            System.out.println(current.nome + " " + current.fone);
            current = current.link;
        }
        System.out.println("fim");
    }

    public String toString() {
        Node laux = l;
        String s = "\nLista:\n";
        while (laux != null) {
            s += laux.nome + " " + laux.fone + "\n";
            laux = laux.link;
        }
        s += "fim";
        return s;
    }

    public static void main(String args[]) {
        ListaFone l1 = new ListaFone();
        l1.IncListaFone("Marcelo", "011 9999999");
        l1.IncListaFone("Fernando", "011 8888888");
        l1.IncListaFone("Marcio", "011 7777777");
        l1.IncListaFone("Gustavo", "011 6666666");
        System.out.println(l1);
        l1.listar();
        l1.RetListaFone("Marcio");
        System.out.println(l1);
        l1.listar();
        String nm = "Marcelo";
        String fn = l1.BuscaFone(nm);
        System.out.println("Telefone do Marcelo: " + fn);
        System.out.println("Telefone do Fernando: " + l1.BuscaFone("Fernando"));
        System.out.println("Telefone do Gustavo: " + l1.BuscaFone("Gustavo"));
        System.out.println("Telefone do Marcio: " + l1.BuscaFone("Marcio"));
        l1.RetListaFone("Marcelo");
        System.out.println(l1);
        l1.listar();
        l1.RetListaFone("Gustavo");
        System.out.println(l1);
        l1.listar();
    }
}