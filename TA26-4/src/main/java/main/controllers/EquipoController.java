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

import main.dto.Equipo;
import main.services.EquipoService;

@RestController
@RequestMapping("/equipos")
public class EquipoController {

	@Autowired
	EquipoService imp;
	
	@GetMapping("/findAll")
	public List<Equipo> findAll(){
		return imp.findAll();
	}
	
	@PostMapping("/create")
	public void create(@RequestBody Equipo equipo) {
		imp.create(equipo);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Equipo equipo) {
		imp.update(equipo);
		
	}
	@DeleteMapping("/equipos/{numSerie}")
	public void deleteById(@PathVariable(name="numSerie")String numSerie) {
		imp.deleteById(numSerie);
	}
}
