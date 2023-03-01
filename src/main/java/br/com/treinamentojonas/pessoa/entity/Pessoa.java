package br.com.treinamentojonas.pessoa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_nascimento")
    private Calendar dataNascimento;

    @OneToMany
    @JoinColumn(name = "_email", foreignKey = @ForeignKey(name = "email"))
    private Email email;

    @OneToMany
    @JoinColumn(name = "_endereco_pessoa", foreignKey = @ForeignKey(name = "endereco_pessoa"))
    private List<Endereco> enderecosPessoas;
}
