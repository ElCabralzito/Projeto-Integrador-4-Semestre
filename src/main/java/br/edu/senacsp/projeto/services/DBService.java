package br.edu.senacsp.projeto.services;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import br.edu.senacsp.projeto.entities.Carro;
import br.edu.senacsp.projeto.repositories.CarroRepository;
@Service
public class DBService {
	@Autowired
	CarroRepository carroRepository;
	
	@Bean
	public void instanciarDB() {
		Carro carro1 = new Carro("Volkswagem", "Gol", "HRS-3435",
				"Verde", 250000, 1996, 8500.43, true);
		
		Carro carro2 = new Carro("Hynduai", "I30", "HJA-9424",
				"Preto", 97000, 2012, 35000.35, true);
		
		carroRepository.saveAll(Arrays.asList(carro1, carro2));
	}
}
