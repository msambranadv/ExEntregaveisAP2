# 🖥️ Projeto TDA em Java – Lista, Pilha e Fila

Este projeto implementa três **Tipos Abstratos de Dados (TDA)** fundamentais:

* **Lista** (Sequencial)
* **Pilha (Stack, LIFO)**
* **Fila (Queue, FIFO)**

Cada estrutura é baseada em **vetor com capacidade máxima de 5 elementos**, demonstrando o comportamento típico de inserção, remoção e visualização de dados.

---

## 📂 Estrutura do Projeto

```
EntregaveisAP2/
├── src/
│   └── EntregaveisAP2/
│       ├── Ex1.java    // Implementação da Lista
│       ├── Ex2.java    // Implementação da Pilha
│       ├── Ex3.java    // Implementação da Fila
│       ├── Ex4.java    // Demonstração dos métodos mostrar()
│       └── Ex5.java    // Menu interativo principal
├── Main.java           // (Opcional)
├── .gitignore
└── EntregaveisAP02.iml
```

> Todas as classes estão no **pacote `EntregaveisAP2`**, seguindo a arquitetura modular.

---

## ⚙️ Funcionalidades

| Estrutura | Operações Disponíveis                               | Limite de Elementos | Ordem de Acesso |
| --------- | --------------------------------------------------- | ------------------- | --------------- |
| **Lista** | `inserir(valor)`, `mostrar()`                       | 5                   | Sequencial      |
| **Pilha** | `empilhar(valor)`, `desempilhar()`, `mostrar()`     | 5                   | LIFO            |
| **Fila**  | `enfileirar(valor)`, `desenfileirar()`, `mostrar()` | 5                   | FIFO            |

---

## 🛠️ Detalhes Técnicos

* **Capacidade fixa:** Todos os TDAs limitam o número de elementos a 5.
* **Mensagens de erro:** Estruturas vazias ou cheias retornam mensagens claras.
* **Método `mostrar()`:** Exibe o estado atual da estrutura de forma organizada.

---

## 🚀 Como Compilar e Executar

1. Abra o terminal na pasta `src/`.
2. Compile todas as classes:

```bash
javac EntregaveisAP2/*.java
```

3. Execute o programa principal (`Ex5.java`):

```bash
java EntregaveisAP2.Ex5
```

4. Use o **menu interativo** para testar Lista, Pilha e Fila:

* Inserir ou empilhar/enfileirar elementos
* Desempilhar/desenfileirar
* Visualizar elementos

---

## 👨‍🏫 Informações do Aluno

| Detalhe        | Valor                           |
| -------------- | ------------------------------- |
| **Nome**       | Murilo Sambrana                 |
| **RA**         | 2403111                         |
| **Curso**      | Ciência da Computação           |
| **Disciplina** | TDA Estruturas de Dados em Java |
