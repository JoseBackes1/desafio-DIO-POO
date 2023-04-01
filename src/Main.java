import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Curso curso1 = new Curso(sc);
        sc.nextLine();

        Curso curso2 = new Curso(sc);
        sc.nextLine();

        Mentoria mentoria = new Mentoria(sc);
        sc.nextLine();

        Bootcamp bootcamp = new Bootcamp(sc);
        sc.nextLine();

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);


        Dev dev1 = new Dev(sc);
        dev1.inscreverBootcamp(bootcamp);
        dev1.printConteudoInscritos();
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        dev1.getConteudosInscritos();
        dev1.printConteudoConcluidos();
        System.out.println("XP:" + dev1.calcularXp());

        System.out.println("-------");

        Dev dev2 = new Dev(sc);
        dev2.inscreverBootcamp(bootcamp);
        dev2.printConteudoInscritos();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        dev2.printConteudoInscritos();
        dev2.printConteudoConcluidos();
        System.out.println("XP:" + dev2.calcularXp());

    }



}