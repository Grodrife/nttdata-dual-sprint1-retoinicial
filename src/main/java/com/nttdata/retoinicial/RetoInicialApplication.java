package com.nttdata.retoinicial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import com.nttdata.retoinicial.repository.Welcome;
import com.nttdata.retoinicial.repository.WelcomeRepositoryI;

@EnableConfigServer
@SpringBootApplication
public class RetoInicialApplication implements CommandLineRunner {

	@Autowired
	private WelcomeRepositoryI repository;

	public static void main(String[] args) {
		SpringApplication.run(RetoInicialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Welcome w1 = new Welcome();
		w1.setMessage("HOLA MUNDO");
		w1.setLanguage("Espanyol");
		w1.setValue("ES");
		repository.save(w1);
		Welcome w2 = new Welcome();
		w2.setMessage("HELLO WORLD");
		w2.setLanguage("English");
		w2.setValue("EN");
		repository.save(w2);
	}
}
