package ExercíciosEntregaveisAP2;

public class Fila implements TDA {
    private int[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;
    private static final int CAPACIDADE = 5;

    public Fila() {
        elementos = new int[CAPACIDADE];
        inicio = 0;
        fim = -1;
        tamanho = 0;
    }

    public void enfileirar(int valor) {
        if (tamanho < CAPACIDADE) {
            // Lógica de Fila Circular
            fim = (fim + 1) % CAPACIDADE;
            elementos[fim] = valor;
            tamanho++;
            System.out.println("Elemento " + valor + " enfileirado com sucesso!");
        } else {
            System.out.println("Erro: Fila cheia! Capacidade máxima: " + CAPACIDADE);
        }
    }

    // Retorna o valor desenfileirado
    public int desenfileirar() {
        if (tamanho > 0) {
            int valor = elementos[inicio];
            // Lógica de Fila Circular
            inicio = (inicio + 1) % CAPACIDADE;
            tamanho--;
            System.out.println("Elemento " + valor + " desenfileirado com sucesso!");
            return valor;
        } else {
            System.out.println("Erro: Fila vazia!");
            return -1; // Valor sentinela
        }
    }

    @Override
    public void mostrar() {
        if (tamanho == 0) {
            System.out.println("Fila vazia!");
            return;
        }
        System.out.print("Fila (entrada -> saída): [");
        for (int i = 0; i < tamanho; i++) {
            int index = (inicio + i) % CAPACIDADE;
            System.out.print(elementos[index]);
            if (i < tamanho - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}