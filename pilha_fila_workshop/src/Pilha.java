public class Pilha {

    private Object[] elementos;
    private int tamanho;
    private int capacidade;
    private int topo;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new Object[capacidade];
        this.topo = -1;
        this.tamanho = 0;
    }

    public Object add(Object element) {
        if(tamanho == capacidade) {
            throw new IllegalStateException("A pilha está cheia");
        }

        topo++;
        elementos[topo] = element;
        tamanho++;

        return element;
    }

    public Object pop() {
        if (tamanho == 0) {
            throw new IllegalStateException("A pilha está vazia!");
        }

        Object removed = elementos[topo];
        topo--;
        tamanho--;

        return removed;

    }

    public Object topo() {
        return elementos[topo];
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

}

