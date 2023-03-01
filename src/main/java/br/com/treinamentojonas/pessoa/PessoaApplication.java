package br.com.treinamentojonas.pessoa;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@SpringBootApplication
public class PessoaApplication {

	public ModelMapper modelMapper(){
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setSkipNullEnabled(true);
		return modelMapper;
	}
	public static void main(String[] args) {
		SpringApplication.run(PessoaApplication.class, args);
	}

}
