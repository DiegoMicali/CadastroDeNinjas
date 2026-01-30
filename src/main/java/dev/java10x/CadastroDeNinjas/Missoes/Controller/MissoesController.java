package dev.java10x.CadastroDeNinjas.Missoes.Controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    // GET -- Requisição para listar missões
    @GetMapping("/listar")
    public String listarMissoes(){
        return "Missoes listadas com sucesso";
    }

    // PUT -- Requisição para criar missões
    @PostMapping("/criar")
    public String criarMissao() {
        return "missão criada com sucesso";
    }

    // PUT -- Requisição para atualizar missões
    @PutMapping("/alterar")
    public String alterarMissao() {
        return "missão alterada com sucesso";
    }

    // DELETE -- Requisição para deletar missões
    @DeleteMapping("/deletar")
    public String deletarMissao() {
        return "missão deletada com sucesso";
    }
}
