package com.example.colecoes;

import java.util.ArrayList;

public abstract class Singleton<T> {

    protected final ArrayList<T> lista;

    protected Singleton() {
        this.lista = new ArrayList<>();
    }

    public void add(T item) {
        lista.add(item);
    }

    public boolean remover(T item) {
        return lista.remove(item);
    }

    public ArrayList<T> buscarTodos() {
        return lista;
    }

    public void printTodasEntidades() {
        for (T item : lista) {
            System.out.println(item.toString());
            System.out.println();
        }
    }
}