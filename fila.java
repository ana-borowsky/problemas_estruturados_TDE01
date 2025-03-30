public class Fila {
    private int primeiro;
    private int ultimo;
    private int[] dados;
    private int capacidade;
    private int tamanhoAtual;

    public Fila(int capacidade) {
        if (capacidade <= 0) {
            System.out.println("Capacidade precisa ser maior que zero!");
            return;
        }
        this.capacidade = capacidade;
        this.dados = new int[capacidade];
        this.primeiro = -1;
        this.ultimo = -1;
        this.tamanhoAtual = 0;
    }

    public boolean cheia() {
        return tamanhoAtual == capacidade;
    }

    public boolean vazia() {
        return tamanhoAtual == 0;
    }

    public void insere(int dado) {
        if (this.cheia()) {
            System.out.println("Fila cheia! Para inserir um número, por favor remova algum primeiro.");
            return;
        }

        if (this.vazia()) {
            primeiro = 0;
        }

        ultimo = (ultimo + 1) % capacidade;
        dados[ultimo] = dado;
        tamanhoAtual++;
    }

    public int remove() {
        if (this.vazia()) {
            System.out.println("Não é possível remover pois a fila está vazia.");
            return -1;
        }

        int dadoRemovido = dados[primeiro];

        if (primeiro == ultimo) {
            primeiro = ultimo = -1;
        } else {
            primeiro = (primeiro + 1) % capacidade;
        }

        tamanhoAtual--;

        return dadoRemovido;
    }

    public void imprime() {
        if (this.vazia()) {
            System.out.println("A fila está vazia.");
            return;
        }

        System.out.println("Fila atual: ");

        int i = 0;
        while (i < tamanhoAtual) {
            int index = (primeiro + i) % capacidade;
            System.out.println(dados[index]);
            i++;
        }
    }
}
