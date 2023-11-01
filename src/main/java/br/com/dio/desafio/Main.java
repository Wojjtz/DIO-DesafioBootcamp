package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Programação Orientada a Objetos");
        curso.setDescricao("POO para iniciantes na linguagem JAVA");
        curso.setCargaHoraria(20);

        System.out.println(curso);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descricao");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

    }
}
