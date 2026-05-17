package Entrevista_JAVA.demo.model;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class AdicionarEmprestimoRequest {

    String cnpjRequerente;

    String cnpjAtendente;

    LocalDate dataEmprestimo;

    LocalDate dataDevolucao;

    public AdicionarEmprestimoRequest(String cnpjRequerente,String cnpjAtendente, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.cnpjRequerente = cnpjRequerente;
        this.cnpjAtendente = cnpjAtendente;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
}
