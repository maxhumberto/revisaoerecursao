package revisao;

public class FilaDePrioridade {
	    private FilaChar f1, f2, f3;

	    FilaDePrioridade(int tamanho) {
	        f1 = new FilaChar(tamanho);
	        f2 = new FilaChar(tamanho);
	        f3 = new FilaChar(tamanho);
	    }

	    boolean isfull() {
	        return f1.isfull() && f2.isfull() && f3.isfull();
	    }

	    boolean isempty() {
	        return f1.isempty() && f2.isempty() && f3.isempty();
	    }

	    void inclui(char elem, int prior) {
	        switch (prior) {
	            case 1:
	                f1.enqueue(elem);
	                break;
	            case 2:
	                f2.enqueue(elem);
	                break;
	            case 3:
	                f3.enqueue(elem);
	                break;
	            default:
	                System.out.println("Prioridade inválida: " + prior);
	        }
	    }

	    char retira() {
	        if (!f1.isempty()) {
	            return f1.dequeue();
	        } else if (!f2.isempty()) {
	            return f2.dequeue();
	        } else if (!f3.isempty()) {
	            return f3.dequeue();
	        } else {
	            System.out.println("Fila de prioridade vazia.");
	            return ' ';
	        }
	    }

	    public static void main(String[] args) {

	        System.out.println("Criando uma fila de Prioridades com 5 elementos em cada prioridade...");
	        FilaDePrioridade fp1 = new FilaDePrioridade(5);
	        System.out.println("Verificando o status da fila...");
	        System.out.println("Está vazia? " + fp1.isempty());
	        System.out.println("Está cheia? " + fp1.isfull());
	        System.out.println("Incluindo o caractere A na prioridade 2...");
	        fp1.inclui('A', 2);
	        System.out.println("Verificando o status da fila...");
	        System.out.println("Está vazia? " + fp1.isempty());
	        System.out.println("Está cheia? " + fp1.isfull());
	        System.out.println("Incluindo o caractere B na prioridade 1...");
	        fp1.inclui('B', 1);
	        System.out.println("Incluindo o caractere C na prioridade 3...");
	        fp1.inclui('C', 3);
	        System.out.println("Incluindo o caractere D na prioridade 3...");
	        fp1.inclui('D', 3);
	        System.out.println("Incluindo o caractere E na prioridade 1...");
	        fp1.inclui('E', 1);
	        System.out.println("Incluindo o caractere F na prioridade 2...");
	        fp1.inclui('F', 2);
	        System.out.println("Incluindo o caractere G na prioridade 1...");
	        fp1.inclui('G', 1);
	        System.out.println("Realizando retrieves na sequência...");
	        System.out.println(fp1.retira());
	        System.out.println(fp1.retira());
	        System.out.println(fp1.retira());
	        System.out.println(fp1.retira());
	        System.out.println(fp1.retira());
	        System.out.println(fp1.retira());
	        System.out.println(fp1.retira());
	        System.out.println("Verificando o status da fila...");
	        System.out.println("Está vazia? " + fp1.isempty());
	        System.out.println("Está cheia? " + fp1.isfull());
	    }
	    public void enqueue(char elem) {
			// TODO Auto-generated method stub
			
		}

		public char dequeue() {
			// TODO Auto-generated method stub
			return 0;
		}

	}