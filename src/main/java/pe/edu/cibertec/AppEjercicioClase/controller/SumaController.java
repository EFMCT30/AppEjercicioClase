package pe.edu.cibertec.AppEjercicioClase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import pe.edu.cibertec.AppEjercicioClase.model.SumaForm;



@Controller
public class SumaController {

	@GetMapping("/suma")
	public String suma(Model model) {
		model.addAttribute("sumaform", new SumaForm());
		model.addAttribute("visualizar",false);
		return "formSuma";
	}
	
	@PostMapping("/suma")
	public String login(@ModelAttribute("sumaForm") SumaForm paramLogin, Model model) {
		
		model.addAttribute("visualizar", true);
		model.addAttribute("mensaje", paramLogin.getNumero1()+paramLogin.getNumero2());	
		return "formSuma";
	}
	
}
