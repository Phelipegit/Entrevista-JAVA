package Entrevista_JAVA.demo.model;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class BaixaRequest {

    private LocalDate localDate;

    private String motivoBaixa;

    private BaixaRequest(LocalDate localDate, String motivoBaixa) {
        this.localDate = localDate;
        this.motivoBaixa = motivoBaixa;
    }
}
