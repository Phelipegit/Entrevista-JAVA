package Entrevista_JAVA.demo;

import lombok.Getter;

@Getter
public enum EnumTipoPATRIMONIO {
    PROPRIO("Próprio"),ALUGADO("Alugado"),EMPRESTADO("Emprestado");

    private String nome;

    EnumTipoPATRIMONIO(String nome) {
        this.nome = nome;
    }
}
