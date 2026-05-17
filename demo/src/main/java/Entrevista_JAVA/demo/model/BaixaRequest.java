package Entrevista_JAVA.demo.model;

import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
public class BaixaRequest {

    private UUID id;

    private LocalDate localDate;

    private String motivoBaixa;

    public BaixaRequest(UUID id,LocalDate localDate, String motivoBaixa) {
        this.id = id;
        this.localDate = localDate;
        this.motivoBaixa = motivoBaixa;
    }
}
