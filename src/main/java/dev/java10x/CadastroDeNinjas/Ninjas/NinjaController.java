package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Minha primeira mensagem nessa rota";
    }

    // Create
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninjaModel) {
        return ninjaService.criarNinja(ninjaModel);    }

    // read
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // read
    @GetMapping("/listarid/{id}")
    public NinjaModel mostrarNinjaId(@PathVariable Long id){
        return ninjaService.listarNinjasId(id);
    }

    // update
    @PutMapping("/alterar")
    public String alterarNinja() {
        return "alterar ninja";
    }

    // delete
    @DeleteMapping("/deletar")
    public String deletarNinja() {
        return "deleta ninja";
    }

}
