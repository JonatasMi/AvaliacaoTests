package br.com.treinamentojonas.pessoa.repository;

import br.com.treinamentojonas.pessoa.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
