package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missao")
public class MissaoController {

    @PostMapping("/criar")
    public String criarMissao(){
        return "criou missao";
    }
    @GetMapping("/listar")
    public String mostrarMissao() {
        return "Mostrar missoes";
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
