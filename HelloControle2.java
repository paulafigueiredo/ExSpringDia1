package com.helloword.hello.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloControle2 {
	
	
	@GetMapping
	public String hello() {
		
		return "Usei a mentalidade de crescimento e atençao aos detalhes";
		
		
	}
	
	
	
	

}
