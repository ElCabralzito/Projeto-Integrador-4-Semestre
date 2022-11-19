package br.edu.senacsp.projeto.repositories;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.edu.senacsp.projeto.entities.Carro;
@Repository
public interface CarroRepository extends JpaRepository<Carro, Integer>{
	
	@Query("SELECT carros FROM Carro carros "
			  + "WHERE carros.disponivel=true ORDER BY carros.modelo")
			List<Carro> listarTodosDisponiveis();
			
			@Query("SELECT carros FROM Carro carros "
					  + "WHERE carros.disponivel=false ORDER BY carros.modelo")
			List<Carro> listarTodosIndisponiveis();

			Optional<Carro> findByModelo(String modelo);
	
}
