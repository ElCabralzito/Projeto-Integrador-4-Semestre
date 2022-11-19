package br.edu.senacsp.projeto.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.DeleteMapping;

import br.edu.senacsp.projeto.entities.Carro;
import br.edu.senacsp.projeto.repositories.CarroRepository;

@Service
public class ConcessionariaService {
	@Autowired
	CarroRepository carroRepository;

	public Carro findById(Integer id) {
		Optional<Carro> carro = carroRepository.findById(id);
		return carro.orElse(null);

	}

	public List<Carro> listarTodosDisponiveis() {
		List<Carro> carros = carroRepository.listarTodosDisponiveis();
		return carros;
	}

	public List<Carro> listarTodosIndisponiveis() {
		List<Carro> carros = carroRepository.listarTodosIndisponiveis();
		return carros;
	}

	public List<Carro> findAll() {
		List<Carro> carros = carroRepository.findAll();
		return carros;
	}

	public Carro findByModelo(String modelo) {
		Optional<Carro> aluno = carroRepository.findByModelo(modelo);
		return aluno.orElse(null);
	}

	public Carro gravarCarro(Carro carro) {
		return carroRepository.save(carro);
	}

	public void deletar(Integer id) {
		carroRepository.deleteById(id);
	}

	public Carro update(Integer id, Carro carro) {
		Carro alterado = findById(id);

		if (alterado != null) {
			alterado.setModelo(carro.getModelo());
			alterado.setAno(carro.getAno());
			alterado.setCor(carro.getCor());
			alterado.setDisponivel(carro.isDisponivel());
			alterado.setFabricante(carro.getFabricante());
			alterado.setKm(carro.getKm());
			alterado.setPlaca(carro.getPlaca());
			alterado.setValor(carro.getValor());
			return carroRepository.save(alterado);
		}
		return null;
	}

}
