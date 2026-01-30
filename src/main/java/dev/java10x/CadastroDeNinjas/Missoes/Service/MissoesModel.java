package dev.java10x.CadastroDeNinjas.Missoes.Service;

import dev.java10x.CadastroDeNinjas.Ninjas.Service.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private char rank;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;
}
