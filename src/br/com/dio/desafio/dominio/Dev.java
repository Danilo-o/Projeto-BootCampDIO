package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;

    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreverBootCamp(BootCamp bootCamp){
        this.conteudoInscritos.addAll(bootCamp.getConteudos());
        bootCamp.getDevsInscritos().add(this);

    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoInscritos.stream().findFirst();
        if (conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudoInscritos.remove(conteudo.get());

        } else {
            System.err.println("Você não está inscrito em nenhum conteúdo!");
        }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXP)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoInscritos() {
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos) {
        this.conteudoInscritos = conteudoInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public DevNivel getNivel(){
        double xp = calcularTotalXp();

        if (xp < 100) return DevNivel.INICIANTE;
        if (xp < 200) return DevNivel.INTERMEDIARIO;
        return DevNivel.AVANCADO;
    }

    public Optional<Certificado> gerarCertificado(BootCamp bootCamp) {
        if (conteudosConcluidos.containsAll(bootCamp.getConteudos())) {
            return Optional.of(new Certificado(this.nome, bootCamp.getNome(), LocalDate.now()));
        }
        return Optional.empty();
    }

    public void concluirBootcamp() {
        while (!conteudoInscritos.isEmpty()) {
            progredir();
        }
    }

    public double calcularProgresso(BootCamp bootCamp) {
        int total = bootCamp.getConteudos().size();
        int concluidos = this.conteudosConcluidos.size();
        return (double) concluidos / total * 100;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev)) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
