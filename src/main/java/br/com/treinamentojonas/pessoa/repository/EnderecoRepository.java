package br.com.treinamentojonas.pessoa.repository;

import br.com.treinamentojonas.pessoa.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
