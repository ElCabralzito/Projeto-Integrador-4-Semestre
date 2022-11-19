package br.edu.senacsp.projeto.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class OlaResource {
	@RequestMapping("/")
	@ResponseBody 
	public String Ola() {
			return "Aplicação Funcionando!!!";
	}
}
