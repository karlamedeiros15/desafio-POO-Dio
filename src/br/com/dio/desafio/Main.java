package br.com.dio.desafio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo(" Curso java");
        curso1.setCargaHoraria(8);
        curso1.setDescricao(" Descrição curso java");

        Curso curso2 = new Curso();
        curso2.setTitulo(" Curso js");
        curso2.setCargaHoraria(4);
        curso2.setDescricao(" Descrição curso js");

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo(" Mentoria java");
        mentoria.setDescricao(" Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome(" Bootcamp Java Developer");
        bootcamp.setDescricao(" Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devKarla = new Dev();
        devKarla.setNome(" Karla");
        devKarla.inscreverBootcamp(bootcamp);
        System.out.println(" Conteúdos inscritos Karla: " + devKarla.getConteudosIncritos());
        devKarla.progredir();
        devKarla.progredir();
        System.out.println("_");
        System.out.println(" Conteúdos Concluídos Karla: " + devKarla.getConteudosConcluidos());
        System.out.println(" Conteúdos inscritos Karla: " + devKarla.getConteudosIncritos());
        System.out.println(" XP: " + devKarla.calcularTotalXp());

        System.out.println("________________________________________");
        Dev devJoao = new Dev();
        devJoao.setNome(" João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println(" Conteúdos inscritos João: " + devJoao.getConteudosIncritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("_");
        System.out.println(" Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println(" Conteúdos inscritos João: " + devJoao.getConteudosIncritos());
        System.out.println(" XP: " + devJoao.calcularTotalXp());
        }
    }
