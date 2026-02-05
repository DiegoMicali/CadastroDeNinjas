package dev.java10x.CadastroDeNinjas.Missoes.Controller;

import dev.java10x.CadastroDeNinjas.Missoes.Service.MissoesDTO;
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
    public MissoesDTO criarMissao(@RequestBody MissoesDTO missao) {
        return missoesService.criarMissao(missao);
    }

    // GET -- Requisição para listar missões
    @GetMapping("/listar")
    public List<MissoesDTO> listarMissoes(){
        return missoesService.listarMissoes();
    }

    // GET -- Requisição para listar missões por Id
    @GetMapping("/listar/{id}")
    public MissoesDTO listarMissoesPorId(@PathVariable Long id) {
        return missoesService.listarMissoesPorId(id);
    }

    // PUT -- Requisição para atualizar missões
    @PutMapping("/alterar/{id}")
    public MissoesDTO alterarMissao(@PathVariable Long id,@RequestBody MissoesDTO missaoAtualizada) {
        return missoesService.atualizarMissao(id, missaoAtualizada);
    }

    // DELETE -- Requisição para deletar missões
    @DeleteMapping("/deletar/{id}")
    public void deletarMissao(@PathVariable Long id) {
         missoesService.deletarMissaoPorId(id);
    }
}
