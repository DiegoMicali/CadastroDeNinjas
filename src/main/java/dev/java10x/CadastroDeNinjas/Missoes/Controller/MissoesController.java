package dev.java10x.CadastroDeNinjas.Missoes.Controller;

import dev.java10x.CadastroDeNinjas.Missoes.Service.MissoesDTO;
import dev.java10x.CadastroDeNinjas.Missoes.Service.MissoesModel;
import dev.java10x.CadastroDeNinjas.Missoes.Service.MissoesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissoesController {

    public MissoesService missoesService;

    public MissoesController(MissoesService missoesService) {
        this.missoesService = missoesService;
    }

    @PostMapping("/criar")
    public ResponseEntity<String> criarMissao(@RequestBody MissoesDTO missao) {
        MissoesDTO novaMissao = missoesService.criarMissao(missao);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("A sua missão " + novaMissao.getNome() + " foi criada com sucesso com id: " + novaMissao.getId());
    }

    @GetMapping("/listar")
    public ResponseEntity<List<MissoesDTO>> listarMissoes(){
        List<MissoesDTO> missoes = missoesService.listarMissoes();
        return ResponseEntity.ok(missoes);
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<?> listarMissoesPorId(@PathVariable Long id) {
        MissoesDTO missao = missoesService.listarMissoesPorId(id);
        if (missao != null) {
            return ResponseEntity.status(HttpStatus.FOUND)
                    .body(missao);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Informe um valor de id válido. O id " + id + "não exite");
        }
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<String> alterarMissao(@PathVariable Long id,@RequestBody MissoesDTO missaoAtualizada) {
        MissoesDTO missao = missoesService.atualizarMissao(id, missaoAtualizada);
        if (missao != null) {
            return ResponseEntity.ok("Missão + " + missao.getNome() + " criado com sucesso. Id: " + id );
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("A missão de id: " + id + "não foi encontrado");
        }
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<String> deletarMissao(@PathVariable Long id) {
         if (missoesService.listarMissoesPorId(id) != null) {
             missoesService.deletarMissaoPorId(id);
             return ResponseEntity.ok("Missão com o id " + id + " deletada com sucesso");
         } else {
             return ResponseEntity.status(HttpStatus.NOT_FOUND)
                     .body("A missão com o id " + id + " não foi encontrada");
         }
    }
}
