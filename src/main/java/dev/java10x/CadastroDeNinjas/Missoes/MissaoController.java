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
    public MissaoModel criarMissao(@RequestBody MissaoModel missaoModel){
        return missaoService.criarMissao(missaoModel);
    }
    @GetMapping("/listar")
    public List<MissaoModel> listarMissao() {
        return missaoService.listarMissoes();
    }
    @GetMapping("/listarid/{id}")
    public MissaoModel listarMissaoId(@PathVariable Long id){
        return missaoService.listarMissaoId(id);
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
