package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Minha primeira mensagem nessa rota";
    }

    // Create
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja criado";
    }

    // read
    @GetMapping("/todos")
    public String mostrarNinjas() {
        return "Mostrar ninjas";
    }

    // read
    @GetMapping("/todosid")
    public String mostrarNinjaId(){
        return "Mostrar ninjas";
    }

    // update
    @PutMapping("alterar")
    public String alterarNinja() {
        return "alterar ninja";
    }

    // delete
    @DeleteMapping("/deletar")
    public String deletarNinja() {
        return "deleta ninja";
    }

}
