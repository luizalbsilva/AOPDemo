package br.com.tamanhofamilia.demos.proxy.AOPDemo.components.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import br.com.tamanhofamilia.demos.proxy.AOPDemo.components.MyFirstComponent;

@Component
public class MyComponent implements MyFirstComponent{
	private static final Logger logger = LoggerFactory.getLogger(MyComponent.class);
	
	static {
		logger.info("Carregando a classe + " + MyComponent.class.getCanonicalName());
	}
	
	public MyComponent() {
		logger.info("Criando nova instância de " + MyComponent.class.getCanonicalName());
	}
	
	@Override
	public void run() {
		logger.info("Chamada para o método run() de " + MyComponent.class.getCanonicalName());
	}

}
