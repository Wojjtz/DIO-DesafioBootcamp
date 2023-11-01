package br.com.dio.desafio;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import br.com.dio.desafio.dominio.Dev;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Programação Orientada a Objetos em JAVA");
        curso1.setDescricao("POO para iniciantes na linguagem Java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Estrutura de Dados em JAVA");
        curso2.setDescricao("Aprende Estrutura de Dados em Java");
        curso2.setCargaHoraria(25);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria para Java Devs");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("BOOTCAMP Java Developer");
        bootcamp.setDescricao("Bootcamp para iniciantes em JAVA");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Rodolfo");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println(dev1.getNome());
        System.out.println("Conteúdos Incritos: \n" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: \n" + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularXPTotal());
        System.out.println("==================");

        Dev dev2 = new Dev();
        dev2.setNome("Priscila");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println(dev2.getNome());
        System.out.println("Conteúdos Incritos: \n" + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularXPTotal());
        dev2.progredir();
        System.out.println("---");
        System.out.println("Conteúdos Incritos: \n" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos: \n" + dev2.getConteudosConcluidos());

    }
}
