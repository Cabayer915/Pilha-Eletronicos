package org.example;

public class Eletronico {
    private int id;
    private String nome;
    private Double valor;
    private String descricaoComponentes;
    private Boolean original;

    public Eletronico(String nome, Double valor, String descricaoComponentes, Boolean original) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.descricaoComponentes = descricaoComponentes;
        this.original = original;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricaoComponentes() {
        return descricaoComponentes;
    }

    public void setDescricaoComponentes(String descricaoComponentes) {
        this.descricaoComponentes = descricaoComponentes;
    }

    public Boolean getOriginal() {
        return original;
    }

    public void setOriginal(Boolean original) {
        this.original = original;
    }

    @Override
    public String toString() {
        return "Eletronico:\n" +
                "id = " + id +
                "\nnome = " + nome +
                "\nvalor = " + valor +
                "\ndescricaoComponentes = " + descricaoComponentes +
                "\nfechado = " + original;
    }
}
