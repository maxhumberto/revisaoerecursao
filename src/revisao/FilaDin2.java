package revisao;

public class FilaDin2 {
	class Nodo {
        char data;
        Nodo link;
    }

    Nodo front, rear;

    FilaDin2	() {
        front = rear = null;
    }

    void store(char elem) {
        Nodo novoNodo = new Nodo();
        novoNodo.data = elem;
        novoNodo.link = null;
        
        if (rear == null) {
            front = rear = novoNodo;
        } else {
            rear.link = novoNodo;
            rear = novoNodo;
        }
    }

    char retrieve() {
        if (front == null) {
            System.out.println("A fila está vazia.");
            return ' '; // Retorna um valor padrão (espaço) neste exemplo.
        }
        
        char aux = front.data;
        front = front.link;
        
        if (front == null) {
            rear = null;
        }
        
        return aux;
    }

    void destroy() {
        front = rear = null;
    }

    void mostra() {
        Nodo current = front;
        System.out.print("Fila: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.link;
        }
        System.out.println();
    }

    public static void main(String args[]) {
        FilaDin2 f1 = new FilaDin2();
        f1.store('A');
        System.out.println("store incluiu: A");
        f1.store('B');
        System.out.println("store incluiu: B");
        f1.store('C');
        System.out.println("store incluiu: C");
        f1.store('D');
        System.out.println("store incluiu: D");
        f1.store('E');
        System.out.println("store incluiu: E");
        f1.mostra();
        System.out.println("retrieve retirou: " + f1.retrieve());
        System.out.println("retrieve retirou: " + f1.retrieve());
        System.out.println("retrieve retirou: " + f1.retrieve());
        f1.mostra();
        f1.store('F');
        System.out.println("store incluiu: F");
        f1.store('G');
        System.out.println("store incluiu: G");
        f1.mostra();
        System.out.println("retrieve retirou: " + f1.retrieve());
        f1.mostra();
        f1.destroy();
        System.out.println("Após destruir...");
        f1.mostra();
    }
}