package Entrevista_JAVA.demo.model;

import Entrevista_JAVA.demo.EnumTipoPATRIMONIO;
import lombok.Getter;
import org.hibernate.validator.constraints.br.CNPJ;

import java.time.LocalDate;
import java.util.UUID;

@Getter
public class AddPatrimonioRequest {

    //UUID DO ESTABELECIMENTO

    private String cnpj;

    private String nome;

    private Integer codigo;

    private EnumTipoPATRIMONIO enumTipo;

    private LocalDate dataEntrada;

    public AddPatrimonioRequest(String cnpj, String nome, Integer codigo, EnumTipoPATRIMONIO enumTipo, LocalDate dataEntrada) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.codigo = codigo;
        this.enumTipo = enumTipo;
        this.dataEntrada = dataEntrada;
    }
}
