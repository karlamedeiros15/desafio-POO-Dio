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


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
