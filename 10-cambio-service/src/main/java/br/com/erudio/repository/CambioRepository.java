package br.com.erudio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.erudio.model.Cambio;

public interface CambioRepository extends JpaRepository<Cambio, Long> {

	public Cambio findByFromAndTo(String from, String to);
}
