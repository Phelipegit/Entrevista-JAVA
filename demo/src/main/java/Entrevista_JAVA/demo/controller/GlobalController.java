package Entrevista_JAVA.demo.controller;

import Entrevista_JAVA.demo.model.CadastrarEstabelecimentoRequest;
import Entrevista_JAVA.demo.service.CadastrarEstabelecimento;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entrevista")
public class GlobalController {

    private final CadastrarEstabelecimento cadastrarEstabelecimento;

    public GlobalController(CadastrarEstabelecimento cadastrarEstabelecimento) {
        this.cadastrarEstabelecimento = cadastrarEstabelecimento;
    }

    @PostMapping("/cadastrarEstabelecimento")
    public void cadastrarEstabelecimento(@RequestBody CadastrarEstabelecimentoRequest cadastroRequest) {
        cadastrarEstabelecimento.cadastrarEstabelecimento(cadastroRequest);
    }

    @PutMapping("/darBaixa")
    public void darBaixaPatrimonio() {

    }

    @PutMapping("/retirarBaixa")
    public void retirarBaixaPatrimonio() {

    }
}
