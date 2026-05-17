package Entrevista_JAVA.demo;

import lombok.Getter;

@Getter
public enum EnumTipoESTABELECIMENTO {

    All("All");

    private String tipoEstabelecimento;

    EnumTipoESTABELECIMENTO(String tipoEstabelecimento) {
        this.tipoEstabelecimento = tipoEstabelecimento;
    }
}
