package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class ObjetivosController {
	
	@GetMapping
	public String objetivos() {
		return	"Meus objetivos de aprendizagem para esta semana são de revisar os videos sobre MYSQL"
				+"e organizar minhas atividades ainda não entregues";
	}

}
