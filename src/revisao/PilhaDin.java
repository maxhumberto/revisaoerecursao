package revisao;

public class PilhaDin {
	class Nodo {
        char data;
        Nodo link;
    }
    
    Nodo topo;
    
    PilhaDin() {
        topo = null;
    }
    
    void push(char elem) {
        Nodo novoNodo = new Nodo();
        novoNodo.data = elem;
        novoNodo.link = topo;
        topo = novoNodo;
    }
    
    char pop() {
        if (topo == null) {
            System.out.println("A pilha está vazia.");
            return ' '; // Retorna um valor padrão (espaço) neste exemplo.
        }
        char aux = topo.data;
        topo = topo.link;
        return aux;
    }
    
    char top() {
        if (topo == null) {
            System.out.println("A pilha está vazia.");
            return ' '; // Retorna um valor padrão (espaço) neste exemplo.
        }
        return topo.data;
    }
    
    void destroy() {
        topo = null;
    }
    
    void mostra() {
        Nodo current = topo;
        System.out.print("Pilha: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.link;
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        PilhaDin p1 = new PilhaDin();
        p1.push('A');
        System.out.println("push incluiu: A");
        p1.push('B');
        System.out.println("push incluiu: B");
        p1.push('C');
        System.out.println("push incluiu: C");
        p1.push('D');
        System.out.println("push incluiu: D");
        p1.push('E');
        System.out.println("push incluiu: E");
        p1.mostra();
        System.out.println("pop retirou: " + p1.pop());
        System.out.println("pop retirou: " + p1.pop());
        System.out.println("pop retirou: " + p1.pop());
        p1.mostra();
        p1.push('F');
        System.out.println("push incluiu: F");
        p1.push('G');
        System.out.println("push incluiu: G");
        p1.mostra();
        System.out.println("pop retirou: " + p1.pop());
        p1.mostra();
        p1.destroy();
        System.out.println("Após destruir...");
        p1.mostra();
    }
}