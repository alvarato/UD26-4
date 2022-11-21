package main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.dto.Investigador;
import main.services.InvestigadorService;

@RestController
@RequestMapping("/investigadores")
public class InvestigadorController {

	@Autowired
	InvestigadorService imp;
	
	@GetMapping("/findAll")
	public List<Investigador> findAll(){
		return imp.findAll();
	}
	
	@PostMapping("/create")
	public void create(@RequestBody Investigador investigador) {
		imp.create(investigador);
	}
	
	@PutMapping("/update")
	public void update( @RequestBody Investigador investigador) {
		imp.update(investigador);
		
	}
	@DeleteMapping("/delete{dni}")
	public void deleteById(@PathVariable("dni")String dni) {
		imp.deleteById(dni);
	}
}