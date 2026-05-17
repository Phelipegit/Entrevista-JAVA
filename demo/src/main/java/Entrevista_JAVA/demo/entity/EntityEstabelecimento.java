package Entrevista_JAVA.demo.entity;

import Entrevista_JAVA.demo.EnumTipoESTABELECIMENTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import org.hibernate.validator.constraints.br.CNPJ;

import java.util.List;
import java.util.UUID;

@Entity
@Getter
public class EntityEstabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotBlank
    private String nome;

    @CNPJ
    @Column(unique = true)
    private String cnpj;

    private EnumTipoESTABELECIMENTO tipoEstabelecimento;

    @OneToMany(mappedBy = "estabelecimentoRequerente")
    private List<EntityEmprestimo> emprestimosRequeridos;

    @OneToMany(mappedBy = "estabelecimentoAtendente")
    private List<EntityEmprestimo> emprestimosAtendens;

    private Integer tempoMaximoEmprestimo;

    public EntityEstabelecimento(String nome, String cnpj, EnumTipoESTABELECIMENTO tipoEstabelecimento, Integer tempoMaximoEmprestimo) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.tipoEstabelecimento = tipoEstabelecimento;
        this.tempoMaximoEmprestimo = tempoMaximoEmprestimo;
    }

    public EntityEstabelecimento() {

    }
}
