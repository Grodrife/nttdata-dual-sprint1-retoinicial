package com.nttdata.retoinicial.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.retoinicial.repository.Welcome;
import com.nttdata.retoinicial.repository.WelcomeRepositoryI;

/**
 * Clase correspondiente al controlador REST
 * 
 * @author Gabriel Rodriguez Felix
 *
 */
@RestController
@RequestMapping("/welcome")
public class WelcomeController {

	@Autowired
	private WelcomeRepositoryI repository;

	/**
	 * Metodo para devolver el mensaje concreto del idioma solicitado
	 * 
	 * @param language
	 * @return
	 */
	@RequestMapping(value = "/{value}")
	public String message(final @PathVariable String value) {

		return repository.findByValue(value).getMessage();
	}

	/**
	 * Metodo para mostrar todos los registros existentes en la base de datos
	 * 
	 * @return
	 */
	@GetMapping
	public List<Welcome> showWelcomes() {

		return repository.findAll();
	}

	/**
	 * Metodo para anyadir un nuevo saludo/idioma al registro
	 * 
	 * @param newWelcome
	 */
	@PostMapping
	public void addWelcome(final @RequestBody Welcome newWelcome) {
		repository.save(newWelcome);
	}

	/**
	 * Metodo para eliminar el registro deseado, mediante su id, de la 
	 * base de datos
	 * 
	 * @param id
	 */
	@DeleteMapping(value = "/{id}")
	public void deleteWelcome(final @PathVariable String id) {
		repository.deleteById(Long.valueOf(id));
	}

	/**
	 * Metodo para actualizar los datos del registro deseado, mediante su id,
	 * de la base de datos
	 * 
	 * @param id
	 * @param newWelcome
	 */
	@PutMapping(value = "/{id}")
	public void updateWelcome(final @PathVariable String id, @RequestBody Welcome newWelcome) {
		Welcome oldWelcome = repository.findById(Long.valueOf(id)).orElseThrow();
		oldWelcome.setLanguage(newWelcome.getLanguage());
		oldWelcome.setMessage(newWelcome.getMessage());
		oldWelcome.setValue(newWelcome.getValue());
		repository.save(oldWelcome);
	}
}
