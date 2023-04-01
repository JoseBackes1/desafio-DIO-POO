package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.Scanner;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria(Scanner sc) {
        System.out.println("INFORME O NOME DA MENTORIA: ");
        this.setTitulo(sc.nextLine());
        System.out.println("INFORME UMA DESCRIÇÃO:");
        this.setDescricao(sc.nextLine());
        this.setData(LocalDate.now());
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + super.getTitulo() + '\'' +
                ", descricao='" + super.getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
