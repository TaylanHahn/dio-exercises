package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // INSTANCIAS DE CURSO
        Curso curso01 = new Curso();
        curso01.setTitulo("Curso JAVA");
        curso01.setDescricao("Aprenda JAVA e domine o mercado!");
        curso01.setCargaHoraria(80);

        Curso curso02 = new Curso();
        curso02.setTitulo("Curso Python");
        curso02.setDescricao("Aprenda Python!");
        curso02.setCargaHoraria(10);

        // INSTANCIAS DE MENTORIA

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria JAVA");
        mentoria.setDescricao("Pra te ajudar no cafezinho");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Aprenda a desenvolver com Java");
        bootcamp.getConteudos().add(curso01);
        bootcamp.getConteudos().add(curso02);
        bootcamp.getConteudos().add(mentoria);

        System.out.println("---------------------------------------------------");

        Dev dev1 = new Dev();
        dev1.setNome("Taylan");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos  " + dev1.getNome() + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteúdos Inscritos de " + dev1.getNome() + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " + dev1.getNome() + dev1.getConteudosConcluidos());
        System.out.println("XP de " + dev1.getNome() + ": " + dev1.calcularTotalXp());

        System.out.println("---------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Jhulia");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de " + dev2.getNome() + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteúdos Inscritos de " + dev2.getNome() + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de " + dev2.getNome() + dev2.getConteudosConcluidos());
        System.out.println("XP de " + dev2.getNome() + ": " + dev2.calcularTotalXp());
    }
}
