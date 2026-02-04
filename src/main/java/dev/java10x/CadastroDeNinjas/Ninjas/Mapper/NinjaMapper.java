package dev.java10x.CadastroDeNinjas.Ninjas.Mapper;

import dev.java10x.CadastroDeNinjas.Ninjas.Service.NinjaDTO;
import dev.java10x.CadastroDeNinjas.Ninjas.Service.NinjaModel;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    public NinjaModel map(NinjaDTO ninjaDTO) {

        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setNome(ninjaDTO.getNome());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setImgUrl(ninjaDTO.getImgUrl());
        ninjaModel.setIdade(ninjaDTO.getIdade());
        ninjaModel.setRank(ninjaDTO.getRank());
        ninjaModel.setMissoes(ninjaDTO.getMissoes());

        return ninjaModel;
    }

    public NinjaDTO map(NinjaModel ninjaModel) {

        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setId(ninjaDTO.getId());
        ninjaDTO.setNome(ninjaDTO.getNome());
        ninjaDTO.setEmail(ninjaDTO.getEmail());
        ninjaDTO.setImgUrl(ninjaDTO.getImgUrl());
        ninjaDTO.setIdade(ninjaDTO.getIdade());
        ninjaDTO.setRank(ninjaDTO.getRank());
        ninjaDTO.setMissoes(ninjaDTO.getMissoes());

        return ninjaDTO;
    }
}
