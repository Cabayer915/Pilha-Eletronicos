package org.example;

public class PilhaObj<T> {

    private T[] pilha;
    private int topo;

    public PilhaObj(int capacidade) {
        this.pilha = (T[]) new Object[capacidade];
        this.topo = -1;
    }

    public boolean isEmpty() {
        return this.topo == -1;
    }

    public boolean isFull() {
        return this.topo == pilha.length - 1;
    }

    public void push(T info) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        topo++;
        pilha[topo] = info;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        T valor = pilha[topo];
        topo--;
        return valor;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return pilha[topo];
    }

    public void exibe() {
        for (int i = 0; i <= topo; i++) {
            System.out.println(pilha[i]);
        }
    }

    public int getTopo() {
        return topo;
    }
}
