package br.com.treinamentojonas.pessoa.service;

import br.com.treinamentojonas.pessoa.entity.Pessoa;
import br.com.treinamentojonas.pessoa.repository.EnderecoRepository;
import br.com.treinamentojonas.pessoa.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Pessoa save(Pessoa pessoa){
        pessoa.getEnderecosPessoas().stream().forEach(endereco -> {
            enderecoRepository.save(endereco);
        });
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> findall(){
        return pessoaRepository.findAll();
    }

    public Optional<Pessoa> findById(Long id){
        return pessoaRepository.findById(id);
    }
}
