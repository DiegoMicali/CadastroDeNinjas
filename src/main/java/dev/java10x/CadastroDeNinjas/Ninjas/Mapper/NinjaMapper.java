package dev.java10x.CadastroDeNinjas.Ninjas.Mapper;

import dev.java10x.CadastroDeNinjas.Missoes.Mapper.MissoesMapper;
import dev.java10x.CadastroDeNinjas.Ninjas.DTO.NinjaDTO;
import dev.java10x.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    private final MissoesMapper missoesMapper;

    public NinjaMapper(MissoesMapper missoesMapper) {
        this.missoesMapper = missoesMapper;
    }

    public NinjaModel map(NinjaDTO ninjaDTO) {

        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setId(ninjaDTO.getId());
        ninjaModel.setNome(ninjaDTO.getNome());
        ninjaModel.setEmail(ninjaDTO.getEmail());
        ninjaModel.setImgUrl(ninjaDTO.getImgUrl());
        ninjaModel.setIdade(ninjaDTO.getIdade());
        ninjaModel.setRank(ninjaDTO.getRank());
        if (ninjaDTO.getMissoes() != null) {
            ninjaModel.setMissoes(missoesMapper.map(ninjaDTO.getMissoes()));
        }

        return ninjaModel;
    }

    public NinjaDTO map(NinjaModel ninjaModel) {

        NinjaDTO ninjaDTO = new NinjaDTO();
        ninjaDTO.setId(ninjaModel.getId());
        ninjaDTO.setNome(ninjaModel.getNome());
        ninjaDTO.setEmail(ninjaModel.getEmail());
        ninjaDTO.setImgUrl(ninjaModel.getImgUrl());
        ninjaDTO.setIdade(ninjaModel.getIdade());
        ninjaDTO.setRank(ninjaModel.getRank());
        if (ninjaModel.getMissoes() != null) {
            ninjaDTO.setMissoes(missoesMapper.map(ninjaModel.getMissoes()));
        }

        return ninjaDTO;
    }
}
