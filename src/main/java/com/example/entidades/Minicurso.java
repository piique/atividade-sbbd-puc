package com.example.entidades;

import java.util.ArrayList;

import com.example.pessoas.Pessoa;
import com.example.pessoas.Profissional;

import java.time.LocalDate;
import java.time.LocalTime;

public class Minicurso {
    LocalDate data;
    LocalTime horaInicio;
    LocalTime horaFim;
    Sala sala;
    Profissional profissional;
    ArrayList<Pessoa> participantes;

    public Minicurso(LocalDate data, LocalTime horaInicio, LocalTime horaFim, Sala sala, Profissional profissional) {
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.sala = sala;
        this.profissional = profissional;
    }

    public Minicurso(LocalDate data, LocalTime horaInicio, LocalTime horaFim, Sala sala, Profissional profissional,
            ArrayList<Pessoa> participantes) {
        this.data = data;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.sala = sala;
        this.profissional = profissional;
        this.participantes = participantes;
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

    public Sala getSala() {
        return this.sala;
    }

    public Profissional getProfissional() {
        return this.profissional;
    }

    public ArrayList<Pessoa> getParticipantes() {
        return this.participantes;
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

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public void setParticipantes(ArrayList<Pessoa> participantes) {
        this.participantes = participantes;
    }

}
