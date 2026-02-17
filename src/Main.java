import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main{

    static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(6);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("descricao Mentoria de java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1.toString() + curso2.toString());
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDavi = new Dev();
        devDavi.setNome("Davi");
        devDavi.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Davi:" + devDavi.getConteudoInscritos());
        devDavi.progredir();
        devDavi.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Davi:" + devDavi.getConteudosConcluidos());
        System.out.println("====================");
        System.out.println("XP:" + devDavi.calcularTotalXp());
        System.out.println("====================");

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Felipe:" + devFelipe.getConteudoInscritos());
        devFelipe.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Felipe:" + devFelipe.getConteudosConcluidos());
        System.out.println("====================");
        System.out.println("XP:" + devFelipe.calcularTotalXp());
        System.out.println("====================");

        Dev devBruna = new Dev();
        devBruna.setNome("Bruna");
        devBruna.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Bruna:" + devBruna.getConteudoInscritos());
        devBruna.progredir();
        devBruna.progredir();
        devBruna.progredir();
        System.out.println("-");
        System.out.println("Conteudos Concluidos Bruna:" + devBruna.getConteudosConcluidos());
        System.out.println("====================");
        System.out.println("XP:" + devBruna.calcularTotalXp());
        System.out.println("====================");
    }

}