package pilha;

public class Pilha {
    private int capacidade;
    private int topo;
    private int[] dados;

    public Pilha(int capacidade) {
        if (capacidade <= 0) {
            System.out.println("Capacidade precisa ser maior que zero.");
        }
        this.capacidade = capacidade;
        this.topo = -1;
        this.dados = new int[capacidade];
    }

    public boolean cheia() {
        return topo == capacidade - 1;
    }

    public boolean vazia() {
        return topo == -1;
    }

    public void insere(int dado) {
        if (this.cheia()) {
            System.out.println("Pilha cheia!");
        } else {
            topo++;
            dados[topo] = dado;
        }
    }

    public void remove() {
        if (this.vazia()) {
            System.out.println("Não é possível remover pois a pilha está vazia");
        } else {
            topo--;
        }
    }

    public void imprime() {
        if (this.vazia()) {
            System.out.println("Lista vazia!");
        } else {
            for (int i = 0; i <= topo; i++) {
                System.out.println(dados[i]);
            }
        }
    }
}
