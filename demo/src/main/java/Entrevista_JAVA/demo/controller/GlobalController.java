package Entrevista_JAVA.demo.controller;

import Entrevista_JAVA.demo.model.BaixaRequest;
import Entrevista_JAVA.demo.model.CadastrarEstabelecimentoRequest;
import Entrevista_JAVA.demo.service.CadastrarEstabelecimento;
import Entrevista_JAVA.demo.service.DarBaixaPatrimonio;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entrevista")
public class GlobalController {

    private final CadastrarEstabelecimento cadastrarEstabelecimento;
    private final DarBaixaPatrimonio darBaixaPatrimonio;

    public GlobalController(CadastrarEstabelecimento cadastrarEstabelecimento,DarBaixaPatrimonio darBaixaPatrimonio) {
        this.cadastrarEstabelecimento = cadastrarEstabelecimento;
        this.darBaixaPatrimonio = darBaixaPatrimonio;
    }

    @PostMapping("/cadastrarEstabelecimento")
    public void cadastrarEstabelecimento(@RequestBody CadastrarEstabelecimentoRequest cadastroRequest) {
        cadastrarEstabelecimento.cadastrarEstabelecimento(cadastroRequest);
    }

    @PutMapping("/darBaixa")
    public void darBaixaPatrimonio(@RequestBody BaixaRequest baixaRequest) {
        darBaixaPatrimonio.darBaixaPatrimonio(baixaRequest);
    }

    @PutMapping("/retirarBaixa")
    public void retirarBaixaPatrimonio() {

    }
}
