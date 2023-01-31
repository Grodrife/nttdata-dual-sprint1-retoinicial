package com.nttdata.retoinicial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interfaz del repositorio que almacena los objetos Welcome en 
 * la base de datos
 * 
 * @author Gabriel Rodriguez Felix
 *
 */
@Repository
public interface WelcomeRepositoryI extends JpaRepository<Welcome, Long> {

	public Welcome findByValue(final String value);
}
