package com.mjgomes.pdvclient.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Categoria {

    private Long id;
    private String nome;

    private List<Produto> products = new ArrayList<>();

    public Categoria() {
    }

    public Categoria(Long id, String nome, List<Produto> products) {
        this.id = id;
        this.nome = nome;
        this.products = products;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getProducts() {
        return products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Categoria)) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(id, categoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
