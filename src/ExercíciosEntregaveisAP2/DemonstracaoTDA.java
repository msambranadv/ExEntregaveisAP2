package ExercíciosEntregaveisAP2;

public class DemonstracaoTDA {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("DEMONSTRAÇÃO INICIAL DAS ESTRUTURAS");
        System.out.println("========================================\n");

        System.out.println("--- LISTA ---");
        Lista lista = new Lista();
        lista.mostrar();
        lista.inserir(10);
        lista.inserir(20);
        lista.mostrar();

        System.out.println("\n--- PILHA ---");
        Pilha pilha = new Pilha();
        pilha.mostrar();
        pilha.empilhar(5);
        pilha.empilhar(15);
        pilha.mostrar();

        System.out.println("\n--- FILA ---");
        Fila fila = new Fila();
        fila.mostrar();
        fila.enfileirar(100);
        fila.enfileirar(200);
        fila.mostrar();

        System.out.println("\n========================================");
        System.out.println("FIM DA DEMONSTRAÇÃO");
        System.out.println("========================================");
    }
}