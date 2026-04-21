package dev.java10x.CadastroDeNinjas.Missoes.Mapper;

import dev.java10x.CadastroDeNinjas.Missoes.DTO.MissoesDTO;
import dev.java10x.CadastroDeNinjas.Missoes.Model.MissoesModel;
import org.springframework.stereotype.Component;

@Component
public class MissoesMapper {

    public MissoesModel map(MissoesDTO missoesDTO) {

        MissoesModel missoesModel = new MissoesModel();
        missoesModel.setId(missoesDTO.getId());
        missoesModel.setNome(missoesDTO.getNome());
        missoesModel.setRank(missoesDTO.getRank());

        return missoesModel;
    }

    public MissoesDTO map(MissoesModel missoesModel) {

        MissoesDTO missoesDTO = new MissoesDTO();
        missoesDTO.setId(missoesModel.getId());
        missoesDTO.setNome(missoesModel.getNome());
        missoesDTO.setRank(missoesModel.getRank());

        return missoesDTO;
    }

}
