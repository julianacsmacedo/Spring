package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Ex02 {
	
	@GetMapping
	public String helloShow() 
	{
		return "Raciocínio lógico e programação, estou buscando essa habilidades para aprimorar "
				+ "tudo que eu venho construindo durante o bootcamp.";
	}

}
