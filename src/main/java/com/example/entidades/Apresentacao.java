package com.example.entidades;

import java.time.LocalTime;

public class Apresentacao {
    LocalTime horaApresentacao;
    Trabalho trabalho;

    public Apresentacao(LocalTime horaApresentacao, Trabalho trabalho) {
        this.horaApresentacao = horaApresentacao;
        this.trabalho = trabalho;
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
}
