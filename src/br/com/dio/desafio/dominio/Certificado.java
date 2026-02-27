package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Certificado {
    private String nomeDev;
    private String nomeBootCamp;
    private LocalDate dataConclusao;

    public Certificado(String nomeDev, String nomeBootCamp, LocalDate dataConclusao) {
        this.nomeDev = nomeDev;
        this.nomeBootCamp = nomeBootCamp;
        this.dataConclusao = dataConclusao;
    }

    @Override
    public String toString() {
        return "Certificado{" +
                "nome='" + nomeDev + '\'' +
                ", BootCamp='" + nomeBootCamp + '\'' +
                ", dataConclusao=" + dataConclusao +
                '}';
    }
}
