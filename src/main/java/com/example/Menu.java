package com.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.example.colecoes.entidades.Apresentacoes;
import com.example.colecoes.entidades.Minicursos;
import com.example.colecoes.entidades.Salas;
import com.example.colecoes.entidades.SessoesTecnica;
import com.example.colecoes.entidades.Trabalhos;
import com.example.colecoes.instituicoes.Empresas;
import com.example.colecoes.instituicoes.Universidades;
import com.example.colecoes.pessoas.Estudantes;
import com.example.colecoes.pessoas.Professores;
import com.example.colecoes.pessoas.Profissionais;
import com.example.entidades.Apresentacao;
import com.example.entidades.Minicurso;
import com.example.entidades.Sala;
import com.example.entidades.SessaoTecnica;
import com.example.entidades.Trabalho;
import com.example.instituicoes.Empresa;
import com.example.instituicoes.Universidade;
import com.example.pessoas.Estudante;
import com.example.pessoas.Pessoa;
import com.example.pessoas.Professor;
import com.example.pessoas.Profissional;
import com.example.utils.Util;

public abstract class Menu {
        public static void cadastroPessoas() {
                // colecoes
                Professores professores = Professores.getInstance();
                Estudantes estudantes = Estudantes.getInstance();
                Profissionais profissionais = Profissionais.getInstance();

                // cadastro de professores
                Professor professor1 = new Professor("João", 33222222);
                Professor professor2 = new Professor("Maria", 33111111);
                professores.add(professor1);
                professores.add(professor2);

                // cadastro de estudantes
                Estudante estudante1 = new Estudante("João", "33113311");
                Estudante estudante2 = new Estudante("Maria", "1312312");
                estudantes.add(estudante1);
                estudantes.add(estudante2);

                // cadastro de profissionais
                Profissional profissional1 = new Profissional("João", "Pedreiro", "111111111111");
                Profissional profissional2 = new Profissional("Maria", "Programadora", "2222222222");
                profissionais.add(profissional1);
                profissionais.add(profissional2);
        }

        public static void cadastroInstituicoes() {
                // colecoes
                Empresas empresas = Empresas.getInstance();
                Universidades universidades = Universidades.getInstance();

                // cadastro de empresas
                Empresa empresa1 = new Empresa("Empresa 1", "111111111111");
                Empresa empresa2 = new Empresa("Empresa 2", "222222222222");
                empresas.add(empresa1);
                empresas.add(empresa2);

                // cadastro de universidades
                Universidade universidade1 = new Universidade("Universidade 1", "111111111111");
                Universidade universidade2 = new Universidade("Universidade 2", "222222222222");
                universidades.add(universidade1);
                universidades.add(universidade2);
        }

        public static void cadastroEntidades() {
                // colecoes
                Professores professores = Professores.getInstance();
                Estudantes estudantes = Estudantes.getInstance();
                Profissionais profissionais = Profissionais.getInstance();
                Salas salas = Salas.getInstance();
                Trabalhos trabalhos = Trabalhos.getInstance();
                Apresentacoes apresentacoes = Apresentacoes.getInstance();
                Minicursos minicursos = Minicursos.getInstance();
                SessoesTecnica sessoesTecnica = SessoesTecnica.getInstance();

                // cadastro de salas
                salas.add(new Sala(1, 1));
                salas.add(new Sala(2, 1));
                salas.add(new Sala(1, 2));
                salas.add(new Sala(2, 2));

                // cadastro de trabalhos
                Trabalho trabalho1 = new Trabalho(1, "Titulo 1", "Resumo 1", estudantes.buscarTodos(),
                                professores.buscarPorCodigoProfessor(1));
                Trabalho trabalho2 = new Trabalho(2, "Titulo 2", "Resumo 2", estudantes.buscarTodos(),
                                professores.buscarPorCodigoProfessor(2));
                trabalhos.add(trabalho1);
                trabalhos.add(trabalho2);

                // cadastro de apresentações
                Apresentacao apresentacao1 = new Apresentacao(
                                LocalTime.parse("11:40", DateTimeFormatter.ofPattern("HH:mm")), trabalho1);
                Apresentacao apresentacao2 = new Apresentacao(
                                LocalTime.parse("11:40", DateTimeFormatter.ofPattern("HH:mm")), trabalho2);
                apresentacoes.add(apresentacao1);
                apresentacoes.add(apresentacao2);

                // cadastro minicursos
                LocalDate data = LocalDate.parse("22/10/1999", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                LocalTime horaInicio = LocalTime.parse("13:40", DateTimeFormatter.ofPattern("HH:mm"));
                LocalTime horaFim = LocalTime.parse("13:40", DateTimeFormatter.ofPattern("HH:mm"));
                ArrayList<Pessoa> participantes = new ArrayList<Pessoa>();
                participantes.add(estudantes.buscarPorMatricula("33113311")); // cadastrados anteriormente
                participantes.add(estudantes.buscarPorMatricula("1312312")); // cadastrados anteriormente
                participantes.add(professores.buscarPorCodigoProfessor(1)); // cadastrados anteriormente
                participantes.add(professores.buscarPorCodigoProfessor(2)); // cadastrados anteriormente

                Minicurso minicurso1 = new Minicurso(data, horaInicio, horaFim, salas.buscarPorIdPredioCodigo(1, 1),
                                profissionais.buscarPorCpf("111111111111"));
                Minicurso minicurso2 = new Minicurso(data, horaInicio, horaFim, salas.buscarPorIdPredioCodigo(2, 1),
                                profissionais.buscarPorCpf("222222222222"), participantes);
                minicursos.add(minicurso1);
                minicursos.add(minicurso2);

                // cadastro sessoes tecnica
                SessaoTecnica sessaoTecnica1 = new SessaoTecnica(data, horaInicio, horaFim,
                                professores.buscarPorCodigoProfessor(1),
                                salas.buscarPorIdPredioCodigo(1, 1), apresentacoes.buscarTodos());
                sessoesTecnica.add(sessaoTecnica1);
        }

        public static void printTodasEntidades() {
                // colecoes
                Professores professores = Professores.getInstance();
                Estudantes estudantes = Estudantes.getInstance();
                Profissionais profissionais = Profissionais.getInstance();
                Salas salas = Salas.getInstance();
                Trabalhos trabalhos = Trabalhos.getInstance();
                Apresentacoes apresentacoes = Apresentacoes.getInstance();
                Minicursos minicursos = Minicursos.getInstance();
                SessoesTecnica sessoesTecnica = SessoesTecnica.getInstance();
                Empresas empresas = Empresas.getInstance();
                Universidades universidades = Universidades.getInstance();

                Util.printMenuTitle("PROFESSORES", false);
                professores.printTodasEntidades();
                Util.printDynamicLine();
                Util.printMenuTitle("ESTUDANTES", false);
                estudantes.printTodasEntidades();
                Util.printDynamicLine();
                Util.printMenuTitle("PROFISSIONAIS", false);
                profissionais.printTodasEntidades();
                Util.printDynamicLine();
                Util.printMenuTitle("SALAS", false);
                salas.printTodasEntidades();
                Util.printDynamicLine();
                Util.printMenuTitle("TRABALHOS", false);
                trabalhos.printTodasEntidades();
                Util.printDynamicLine();
                Util.printMenuTitle("APRESENTAÇÕES", false);
                apresentacoes.printTodasEntidades();
                Util.printDynamicLine();
                Util.printMenuTitle("MINICURSOS", false);
                minicursos.printTodasEntidades();
                Util.printDynamicLine();
                Util.printMenuTitle("SESSÕES TÉCNICAS", false);
                sessoesTecnica.printTodasEntidades();
                Util.printDynamicLine();
                Util.printMenuTitle("EMPRESAS", false);
                empresas.printTodasEntidades();
                Util.printDynamicLine();
                Util.printMenuTitle("UNIVERSIDADES", false);
                universidades.printTodasEntidades();
                Util.printDynamicLine();

        }
}
