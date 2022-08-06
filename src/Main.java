import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("java");
        curso1.setDescricao("curso java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("javascript");
        curso2.setDescricao("curso javascript");
        curso2.setCargaHoraria(4);

        //Conteudo conteudo = new Curso();//polimorfismo

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descricao mentoria de java");
        mentoria1.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);


        Dev devMarilia = new Dev();
        devMarilia.setNome("Marilia");
        devMarilia.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" +devMarilia.getConteudosInscritos());


        devMarilia.progredir();
        System.out.println("---");

        System.out.println("Conteúdos inscritos" +devMarilia.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" +devMarilia.getConteudosConcluidos());
        System.out.println("XP: "+devMarilia.calcularTotalXP());



        System.out.println("====================================================================");

        Dev devJose = new Dev();
        devJose.setNome("Jose");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos" +devJose.getConteudosInscritos());

        devJose.progredir();
        devJose.progredir();
        System.out.println("---");

        System.out.println("Conteúdos inscritos" +devJose.getConteudosInscritos());
        System.out.println("Conteúdos concluidos" +devJose.getConteudosConcluidos());
        System.out.println("XP: "+devJose.calcularTotalXP());
    }
}
