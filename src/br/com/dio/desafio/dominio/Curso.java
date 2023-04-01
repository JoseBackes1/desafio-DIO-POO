package br.com.dio.desafio.dominio;

import java.util.Scanner;

public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso(Scanner sc) {
        super();
        System.out.println("INFORME O NOME DO CURSO: ");
        this.setTitulo(sc.nextLine());
        System.out.println("INFORME UMA DESCRIÇÃO:");
        this.setDescricao(sc.nextLine());
        System.out.println("INFORME A CARGA HORARIA: ");
        this.setCargaHoraria(sc.nextInt());
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
}
