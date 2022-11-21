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

import main.dto.Reserva;
import main.services.ReservaService;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

	@Autowired
	ReservaService imp;
	
	@GetMapping("/findAll")
	public List<Reserva> findAll(){
		return imp.findAll();
	}
	
	@PostMapping("/create")
	public void create(@RequestBody Reserva reserva) {
		imp.create(reserva);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody Reserva reserva) {		 
		 imp.update(reserva);
		 
	}
	
	@DeleteMapping("/delete{id}")
	public void eliminarReserva(@PathVariable(name="id")Long id) {
		imp.deleteById(id);
		
	}
}