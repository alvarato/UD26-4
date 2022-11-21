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

import main.dto.Facultad;
import main.services.FacultadService;

@RestController
@RequestMapping("/facultades")
public class FacultadController {

	@Autowired
	FacultadService imp;
	
	@GetMapping("/findAll")
	public List<Facultad> findAll(){
		return imp.findAll();
	}
	
	@PostMapping("/create")
	public void create(@RequestBody Facultad facultad) {
		 imp.create(facultad);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Facultad facultad) {
		imp.update(facultad);
	}
	
	@DeleteMapping("/delete{codigo}")
	public void eliminarFacultad(@PathVariable(name="codigo")Long codigo) {
		imp.deleteById(codigo);
	}
}
