package dev.java10x.CadastroDeNinjas.Missoes.Controller;

import dev.java10x.CadastroDeNinjas.Missoes.Service.MissoesModel;
import dev.java10x.CadastroDeNinjas.Missoes.Service.MissoesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    public MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    // PUT -- Requisição para criar missões
    @PostMapping("/criar")
    public MissoesModel criarMissao(@RequestBody MissoesModel missao) {
        return missoesService.criarMissao(missao);
    }

    // GET -- Requisição para listar missões
    @GetMapping("/listar")
    public List<MissoesModel> listarMissoes(){
        return missoesService.listarMissoes();
    }

    // GET -- Requisição para listar missões por Id
    @GetMapping("/listar/{id}")
    public MissoesModel listarMissoesPorId(@PathVariable Long id) {
        return missoesService.listarMissoesPorId(id);
    }

    // PUT -- Requisição para atualizar missões
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "missão alterada com sucesso";
    }

    // DELETE -- Requisição para deletar missões
    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id) {
         missoesService.deletarMissaoPorId(id);
    }
}
