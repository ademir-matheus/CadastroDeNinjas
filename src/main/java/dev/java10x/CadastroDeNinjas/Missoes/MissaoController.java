package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missao")
public class MissaoController {

    private MissaoService missaoService;

    public MissaoController(MissaoService missaoService) {
        this.missaoService = missaoService;
    }

    @PostMapping("/criar")
    public String criarMissao(){
        return "criou missao";
    }
    @GetMapping("/listar")
    public List<MissaoModel> listarMissao() {
        return missaoService.listarMissoes();
    }
    @GetMapping("/listarid")
    public String listarMissaoId(){
        return "";
    }
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "alterou missao";
    }
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Deletou missao";
    }
}
