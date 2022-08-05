import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("java");
        curso1.setDescricao("curso java");
        curso1.setCargaHoraria(3);

        curso2.setTitulo("javascript");
        curso2.setDescricao("curso javascript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("descricao mentoria de java");
        mentoria1.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
