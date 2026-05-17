package Entrevista_JAVA.demo.entity;

import Entrevista_JAVA.demo.EnumTipoPATRIMONIO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
public class EntityPatrimonio {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome;

    private Integer codigo;

    @Enumerated(EnumType.STRING)
    private EnumTipoPATRIMONIO enumTipo;

    private LocalDate dataEntrada;

    @ManyToOne
    @JoinColumn(name = "id_estabelecimento")
    private EntityEstabelecimento estabelecimento;

    @Setter
    private Boolean baixa = false;

    @Setter
    private LocalDate dataBaixa;

    @Setter
    private String motivoBaixa;

    public EntityPatrimonio(String nome, Integer codigo, EnumTipoPATRIMONIO enumTipo, LocalDate dataEntrada, EntityEstabelecimento estabelecimento) {
        this.nome = nome;
        this.codigo = codigo;
        this.enumTipo = enumTipo;
        this.dataEntrada = dataEntrada;
        this.estabelecimento = estabelecimento;
    }

    //Desativar patrimônio
    public EntityPatrimonio(LocalDate dataBaixa,String motivoBaixa) {
        this.dataBaixa = dataBaixa;
        this.motivoBaixa = motivoBaixa;
        this.baixa = true;
    }

    public EntityPatrimonio() {

    }
}
