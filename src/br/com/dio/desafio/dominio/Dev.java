package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscritos=new LinkedHashSet<>();
    private Set<Conteudo> conteudoConcluidos=new LinkedHashSet<>();

    public Dev(Scanner sc) {
        System.out.println("INFORME O NOME DO DEV: ");
        this.setNome(sc.nextLine());
    }

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudoInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());
        }else{
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }

    public double calcularXp(){
        return this.conteudoConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudoInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoInscritos, dev.conteudoInscritos) && Objects.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoInscritos, conteudoConcluidos);
    }


    public void printConteudoInscritos() {
        System.out.println("Conteúdos Inscritos de "+this.getNome()+": "+  this.getConteudosInscritos());
    }
    public void printConteudoConcluidos() {
        System.out.println("Conteúdos Concluidos de "+this.getNome()+": "+  this.getConteudosConcluidos());
    }
}
