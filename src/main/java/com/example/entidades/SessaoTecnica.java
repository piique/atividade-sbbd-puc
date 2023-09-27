package com.example.entidades;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

import com.example.pessoas.Professor;

public class SessaoTecnica {
    private int id;
    private LocalDate data;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private Professor professor;
    private Sala sala;

    private static int ultimoId;
    static {
        ultimoId = 0;
    }

    ArrayList<Apresentacao> apresentacoes;

    public SessaoTecnica(LocalDate data, LocalTime horaInicio, LocalTime horaFim, Professor professor, Sala sala,
            Apresentacao apresentacoes) {
        this.id = getNextId();
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.professor = professor;
        this.sala = sala;
        this.apresentacoes = new ArrayList<Apresentacao>();
        this.apresentacoes.add(apresentacoes);
    }

    public SessaoTecnica(LocalDate data, LocalTime horaInicio, LocalTime horaFim, Professor professor, Sala sala,
            ArrayList<Apresentacao> apresentacoes) {
        this.id = getNextId();
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.professor = professor;
        this.sala = sala;
        this.apresentacoes = apresentacoes;
    }

    private static int getNextId() {
        return ++ultimoId;
    }

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return this.data;
    }

    public LocalTime getHoraInicio() {
        return this.horaInicio;
    }

    public LocalTime getHoraFim() {
        return this.horaFim;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public Sala getSala() {
        return this.sala;
    }

    public ArrayList<Apresentacao> getApresentacoes() {
        return this.apresentacoes;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFim(LocalTime horaFim) {
        this.horaFim = horaFim;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setApresentacoes(ArrayList<Apresentacao> apresentacoes) {
        this.apresentacoes = apresentacoes;
    }

    public void addApresentacao(Apresentacao apresentacao) {
        this.apresentacoes.add(apresentacao);
    }

    @Override
    public String toString() {
        return "SessaoTecnica [apresentacoes=" + apresentacoes + ", data=" + data + ", horaFim=" + horaFim
                + ", horaInicio=" + horaInicio + ", id=" + id + ", professor=" + professor + ", sala=" + sala + "]";
    }

}
