package dev.java10x.CadastroDeNinjas.Missoes.Service;

import dev.java10x.CadastroDeNinjas.Missoes.Repository.MissoesRepository;
import dev.java10x.CadastroDeNinjas.Ninjas.Service.NinjaModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    public MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    //Listar todas as missões
    public List<MissoesModel> listarMissoes() {
        return missoesRepository.findAll();
    }


    //Listar missões por id
    public MissoesModel listarMissoesPorId(Long id) {
        Optional<MissoesModel> missaoPorId = missoesRepository.findById(id);
        return missaoPorId.orElse(null);
    }

    //Criar missão
    public MissoesModel criarMissao(MissoesModel missao) {
     return missoesRepository.save(missao);
    }

    //Deletar missão por id
    public void deletarMissaoPorId(Long id) {
        missoesRepository.deleteById(id);
    }
}