package org.example;

import java.util.ArrayList;
import java.util.List;

public class Repositorio {

    private List<Eletronico> lista;
    private PilhaObj<Integer> pilha;
    private FilaObj<Eletronico> fila;
    private int id;

    public Repositorio() {
        this.lista = new ArrayList<>();
        this.pilha = new PilhaObj<>(10);
        this.fila = new FilaObj<>(10);
        this.id = 100;
    }

    public void salvar(Eletronico eletronico) {
        eletronico.setId(id++);
        lista.add(eletronico);
        pilha.push(eletronico.getId());
    }

    public void deletar(int id) {
        Eletronico eletronico = null;
        for (Eletronico r : lista) {
            if (r.getId() == id) {
                eletronico = r;
                break;
            }
        }
        if (eletronico != null) {
            lista.remove(eletronico);
        } else {
            System.out.println("ID não encontrado no repositorio");
        }
    }

    public void exibir() {
        if (lista.isEmpty()) {
            System.out.println("Repositório está vazio");
        } else {
            for (Eletronico r : lista) {
                System.out.println(r);
            }
        }
        pilha.exibe();
        fila.exibe();
    }

    public void desfazer() {
        if (pilha.isEmpty()) {
            System.out.println("Não há nada para desfazer");
        } else {
            int id = pilha.pop();
            deletar(id);
        }
    }

    public void agendarSalvar(Eletronico eletronico) {
        if (fila.isFull()) {
            System.out.println("Fila de agendamento cheia!");
        } else {
            fila.insert(eletronico);
            System.out.println("Eletrônico agendado para salvar posteriormente: " + eletronico);
        }
    }

    public void executarAgendado(int qtdOperacoes) {
        if (fila.isEmpty()) {
            System.out.println("Não há operações agendadas");
        } else if (qtdOperacoes <= 0 || qtdOperacoes > fila.getTamanho()) {
            System.out.println("Quantidade inválida");
        } else {
            for (int i = 0; i < qtdOperacoes; i++) {
                Eletronico eletronico = fila.poll();
                if (eletronico != null) {
                    salvar(eletronico);
                    System.out.println("Eletrônico salvo: " + eletronico);
                }
            }
        }
    }
}