package br.com.treinamentojonas.pessoa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "londragouro")
    private String londragouro;

    @Column(name = "cep")
    private Integer cep;

    @Column(name = "numero")
    private Integer numero;

    @Column(name = "cidade")
    private String cidade;

}
