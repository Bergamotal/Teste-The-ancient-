public class Fila {
    private static Object[] elementos;
    private static int tamanho;
    private static int capacidade;
    private int inicio;
    private static int fim;

    public Fila(int capacidade){
        this.capacidade = capacidade;
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
        this.inicio = 0;
        this.fim = -1;
    }

    public static Object add(Object elemento){
        if(tamanho == capacidade){
            throw new IllegalStateException("A fila está cheia");

        }

        fim += 1;
        elementos[fim] = elemento;
        tamanho++;

        return elemento;
    }

    public Object remove(Object elemento){
        if(tamanho == 0) {
            throw new IllegalStateException("A fila está vazia!");
        }

        Object removed = elementos[inicio];
        inicio += 1;
        return removed;
    }

    public Object first() {
        if(tamanho == 0) {
            throw new IllegalStateException("A fila está vazia!");
        }

        return elementos[inicio];
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int tamanho() {
        return tamanho;
    }

}
