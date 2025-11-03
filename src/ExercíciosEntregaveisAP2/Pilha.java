package ExercíciosEntregaveisAP2;

public class Pilha implements TDA {
    private int[] elementos;
    private int topo;
    private static final int CAPACIDADE = 5;

    public Pilha() {
        elementos = new int[CAPACIDADE];
        topo = -1;
    }

    public void empilhar(int valor) {
        if (topo < CAPACIDADE - 1) {
            topo++;
            elementos[topo] = valor;
            System.out.println("Elemento " + valor + " empilhado com sucesso!");
        } else {
            System.out.println("Erro: Pilha cheia! Capacidade máxima: " + CAPACIDADE);
        }
    }

    // Retorna o valor desempilhado
    public int desempilhar() {
        if (topo >= 0) {
            int valor = elementos[topo];
            topo--;
            System.out.println("Elemento " + valor + " desempilhado com sucesso!");
            return valor;
        } else {
            System.out.println("Erro: Pilha vazia!");
            return -1; // Valor sentinela
        }
    }

    @Override
    public void mostrar() {
        if (topo < 0) {
            System.out.println("Pilha vazia!");
            return;
        }
        System.out.print("Pilha (topo -> base): [");
        for (int i = topo; i >= 0; i--) {
            System.out.print(elementos[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println("]");
    }
}