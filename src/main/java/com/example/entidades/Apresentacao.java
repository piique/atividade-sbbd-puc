package com.example.entidades;

import java.time.LocalTime;

public class Apresentacao {
    private int id;
    private LocalTime horaApresentacao;
    private Trabalho trabalho;

    private static int ultimoId;
    static {
        ultimoId = 0;
    }

    public Apresentacao(LocalTime horaApresentacao, Trabalho trabalho) {
        this.id = getNextId();
        this.horaApresentacao = horaApresentacao;
        this.trabalho = trabalho;
    }

    public int getId() {
        return this.id;
    }

    private int getNextId() {
        return ++ultimoId;
    }

    public LocalTime getHoraApresentacao() {
        return this.horaApresentacao;
    }

    public Trabalho getTrabalho() {
        return this.trabalho;
    }

    public void setHoraApresentacao(LocalTime horaApresentacao) {
        this.horaApresentacao = horaApresentacao;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }

    @Override
    public String toString() {
        return "Apresentacao [id=" + id + ", horaApresentacao=" + horaApresentacao + ", trabalho=" + trabalho
                + "]";
    }
}
