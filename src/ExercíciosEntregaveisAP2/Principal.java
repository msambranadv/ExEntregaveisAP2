package ExercíciosEntregaveisAP2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista();
        Pilha pilha = new Pilha();
        Fila fila = new Fila();
        int opcao;

        do {
            System.out.println("\n===== MENU PRINCIPAL =====");
            System.out.println("1. Testar Lista");
            System.out.println("2. Testar Pilha");
            System.out.println("3. Testar Fila");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Limpa a entrada inválida
                opcao = -1;
                continue;
            }

            switch (opcao) {
                case 1:
                    menuLista(scanner, lista);
                    break;
                case 2:
                    menuPilha(scanner, pilha);
                    break;
                case 3:
                    menuFila(scanner, fila);
                    break;
                case 0:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void menuLista(Scanner scanner, Lista lista) {
        int opcao;
        do {
            System.out.println("\n--- MENU LISTA ---");
            System.out.println("1. Inserir elemento");
            System.out.println("2. Mostrar lista");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida.");
                scanner.next();
                opcao = -1;
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a inserir: ");
                    if (scanner.hasNextInt()) {
                        int valor = scanner.nextInt();
                        lista.inserir(valor);
                    } else {
                        System.out.println("Valor inválido.");
                        scanner.next();
                    }
                    break;
                case 2:
                    lista.mostrar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void menuPilha(Scanner scanner, Pilha pilha) {
        int opcao;
        do {
            System.out.println("\n--- MENU PILHA ---");
            System.out.println("1. Empilhar elemento");
            System.out.println("2. Desempilhar elemento");
            System.out.println("3. Mostrar pilha");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida.");
                scanner.next();
                opcao = -1;
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a empilhar: ");
                    if (scanner.hasNextInt()) {
                        int valor = scanner.nextInt();
                        pilha.empilhar(valor);
                    } else {
                        System.out.println("Valor inválido.");
                        scanner.next();
                    }
                    break;
                case 2:
                    pilha.desempilhar();
                    break;
                case 3:
                    pilha.mostrar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void menuFila(Scanner scanner, Fila fila) {
        int opcao;
        do {
            System.out.println("\n--- MENU FILA ---");
            System.out.println("1. Enfileirar elemento");
            System.out.println("2. Desenfileirar elemento");
            System.out.println("3. Mostrar fila");
            System.out.println("0. Voltar");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                System.out.println("Entrada inválida.");
                scanner.next();
                opcao = -1;
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor a enfileirar: ");
                    if (scanner.hasNextInt()) {
                        int valor = scanner.nextInt();
                        fila.enfileirar(valor);
                    } else {
                        System.out.println("Valor inválido.");
                        scanner.next();
                    }
                    break;
                case 2:
                    fila.desenfileirar();
                    break;
                case 3:
                    fila.mostrar();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}