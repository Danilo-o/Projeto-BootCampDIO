import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {


    public static void  main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("JavaScript");
        curso2.setDescricao("Descrição curso JavaScript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos: " + devMaria.getConteudoInscritos());
        System.out.println("Progresso: " + devMaria.calcularProgresso(bootCamp) + "%");
        devMaria.concluirBootcamp();
        System.out.println("Conteudos Inscritos: " + devMaria.getConteudoInscritos());
        System.out.println("Conteudos Concluidos: " + devMaria.getConteudosConcluidos());
        System.out.println("Progresso: " + devMaria.calcularProgresso(bootCamp) + "%");
        System.out.println("Xp:" + devMaria.calcularTotalXp());
        System.out.println("Nivel: " + devMaria.getNivel());

        devMaria.gerarCertificado(bootCamp)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Bootcamp ainda não concluído.")
                );

        System.out.println("-----------------");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootCamp(bootCamp);
        System.out.println("Conteudos Inscritos: " + devCarlos.getConteudoInscritos());
        System.out.println("Progresso: " + devCarlos.calcularProgresso(bootCamp) + "%");
        devCarlos.concluirBootcamp();
        System.out.println("-");
        System.out.println("Conteudos Inscritos: " + devCarlos.getConteudoInscritos());
        System.out.println("Conteudos Concluidos: " + devCarlos.getConteudosConcluidos());
        System.out.println("Progresso: " + devCarlos.calcularProgresso(bootCamp) + "%");
        System.out.println("Xp:" + devCarlos.calcularTotalXp() );
        System.out.println("Nivel: " + devCarlos.getNivel());

        devCarlos.gerarCertificado(bootCamp)
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Bootcamp ainda não concluído.")
                );

    }
}
