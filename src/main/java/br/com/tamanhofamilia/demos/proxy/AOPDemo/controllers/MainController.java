package br.com.tamanhofamilia.demos.proxy.AOPDemo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	private static Logger logger = LoggerFactory.getLogger(MainController.class);

	static {
		logger.info("Carregando a classe " + MainController.class.getCanonicalName());
	}
	
	public MainController() {
		logger.info("Criando uma instância de " + MainController.class.getCanonicalName());
	}
		
	@GetMapping("/")
	public void itsAlive() {		
	}
}
