package ExercíciosEntregaveisAP2;

public class Lista implements TDA {
    private int[] elementos;
    private int tamanho;
    private static final int CAPACIDADE = 5;

    public Lista() {
        elementos = new int[CAPACIDADE];
        tamanho = 0;
    }

    public void inserir(int valor) {
        if (tamanho < CAPACIDADE) {
            elementos[tamanho] = valor;
            tamanho++;
            System.out.println("Elemento " + valor + " inserido com sucesso!");
        } else {
            System.out.println("Erro: Lista cheia! Capacidade máxima: " + CAPACIDADE);
        }
    }

    @Override
    public void mostrar() {
        if (tamanho == 0) {
            System.out.println("Lista vazia!");
            return;
        }
        System.out.print("Lista: [");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i]);
            if (i < tamanho - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}