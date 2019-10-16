package br.com.drummond.resources;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ac2 {

	@RequestMapping(value = "/api8/{numero}", method = RequestMethod.GET)
	public String api8 (@PathVariable Integer numero) {
		String Sim = "Sim";
		String Nao = "Nao";
		
		if(numero % 8 == 0) {
			return Sim;
		}else {
			return Nao;
		}
	}
}