package com.nttdata.retoinicial.repository;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase perteneciente a la entidad Welcome
 * 
 * @author Gabriel Rodriguez Felix
 *
 */
@Entity
@Table(name = "WELCOME")
public class Welcome implements Serializable {

	// ID Serial
	private static final long serialVersionUID = 1L;

	private Long id;

	private String message;

	private String language;
	
	private String value;

	/**
	 * Metodo Getter del atributo id
	 * 
	 * @return
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	public Long getId() {
		return id;
	}

	/**
	 * Metodo Setter del atributo id
	 * 
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Metodo Getter del atributo message
	 * 
	 * @return
	 */
	@Column(name = "MESSAGE")
	public String getMessage() {
		return message;
	}

	/**
	 * Metodo Setter del atributo message
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Metodo Getter del atributo language
	 * 
	 * @return
	 */
	@Column(name = "LANGUAGE")
	public String getLanguage() {
		return language;
	}

	/**
	 * Metodo Setter del atributo language
	 * 
	 * @param language
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * Metodo Getter del atributo value
	 * 
	 * @return
	 */
	@Column(name = "VALUE1")
	public String getValue() {
		return value;
	}

	/**
	 * Metodo Setter del atributo value
	 * 
	 * @param value
	 */
	public void setValue(String value) {
		this.value = value;
	}
	

}
