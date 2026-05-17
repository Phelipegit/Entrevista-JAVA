package Entrevista_JAVA.demo.controller;

import Entrevista_JAVA.demo.model.AddPatrimonioRequest;
import Entrevista_JAVA.demo.model.BaixaRequest;
import Entrevista_JAVA.demo.model.CadastrarEstabelecimentoRequest;
import Entrevista_JAVA.demo.service.AdicionarPatrimonio;
import Entrevista_JAVA.demo.service.CadastrarEstabelecimento;
import Entrevista_JAVA.demo.service.DarBaixaPatrimonio;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entrevista")
public class GlobalController {

    private final CadastrarEstabelecimento cadastrarEstabelecimento;
    private final AdicionarPatrimonio adicionarPatrimonio;
    private final DarBaixaPatrimonio darBaixaPatrimonio;

    public GlobalController(CadastrarEstabelecimento cadastrarEstabelecimento,AdicionarPatrimonio adicionarPatrimonio,DarBaixaPatrimonio darBaixaPatrimonio) {
        this.cadastrarEstabelecimento = cadastrarEstabelecimento;
        this.adicionarPatrimonio = adicionarPatrimonio;
        this.darBaixaPatrimonio = darBaixaPatrimonio;
    }

    @PostMapping("/cadastrarEstabelecimento")
    public void cadastrarEstabelecimento(@RequestBody CadastrarEstabelecimentoRequest cadastroRequest) {
        cadastrarEstabelecimento.cadastrarEstabelecimento(cadastroRequest);
    }

    @PostMapping("/addPatrimonio")
    public void addPatrimonio(@RequestBody AddPatrimonioRequest addRequest) {
        adicionarPatrimonio.addPatrimonio(addRequest);
    }

    @PutMapping("/darBaixa")
    public void darBaixaPatrimonio(@RequestBody BaixaRequest baixaRequest) {
        darBaixaPatrimonio.darBaixaPatrimonio(baixaRequest);
    }

    @PutMapping("/retirarBaixa")
    public void retirarBaixaPatrimonio() {

    }
}
