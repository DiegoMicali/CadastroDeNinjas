package dev.java10x.CadastroDeNinjas.Missoes.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroDeNinjas.Ninjas.Model.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_missoes")
@ToString
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private char rank;

    @OneToMany(mappedBy = "missoes")
    @JsonIgnore
    private List<NinjaModel> ninjas;
}
