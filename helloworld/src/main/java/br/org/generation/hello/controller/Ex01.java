package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Ex01 {
	
	@GetMapping
	public String helloShow() 
	{
		return "As mentalidades necessárias para realizar a atividade foram: atenção aos detalhes, "
				+ "mentalidade de crescimento e persistência";
	}

}
