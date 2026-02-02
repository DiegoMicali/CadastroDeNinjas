package dev.java10x.CadastroDeNinjas.Ninjas.Controller;

import dev.java10x.CadastroDeNinjas.Ninjas.Service.NinjaModel;
import dev.java10x.CadastroDeNinjas.Ninjas.Service.NinjaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    public NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a primeira mensagem nessa rota";
    }

    // Adicionar ninja
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar todos os ninjas
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Monstrar ninjas por id
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }

    // Alterar dados dos ninjas
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Mostrar ninja por id";
    }

    // Deletar ninjas
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id) {
        ninjaService.deletarNinjaPorId(id);
    }
}
