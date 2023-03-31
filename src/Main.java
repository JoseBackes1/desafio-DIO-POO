import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("ddescricao curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("ddescricao curso Python");
        curso2.setCargaHoraria(9);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria Java");
        mentoria.setDescricao("Descricao mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp=new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJose=new Dev();
        devJose.setNome("José");
        devJose.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos José" + devJose.getConteudoInscritos());
        System.out.println("XP: "+ devJose.calcularXp());
        System.out.println("--");
        devJose.progredir();
        System.out.println("Conteudos inscritos José" + devJose.getConteudoInscritos());
        System.out.println("Conteudos concluidos José" + devJose.getConteudoConcluidos());
        System.out.println("XP: "+ devJose.calcularXp());

        System.out.println("--------------");
        Dev devCamila=new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos camila" + devCamila.getConteudoInscritos());
        System.out.println("XP: "+ devCamila.calcularXp());
        System.out.println("--");
        devCamila.progredir();
        System.out.println("Conteudos inscritos camila" + devCamila.getConteudoInscritos());
        System.out.println("Conteudos concluidos Camila" + devCamila.getConteudoConcluidos());
        System.out.println("XP: "+ devCamila.calcularXp());
        System.out.println("--");
        devCamila.progredir();
        System.out.println("Conteudos inscritos camila" + devCamila.getConteudoInscritos());
        System.out.println("Conteudos concluidos Camila" + devCamila.getConteudoConcluidos());
        System.out.println("XP: "+ devCamila.calcularXp());


    }
}
