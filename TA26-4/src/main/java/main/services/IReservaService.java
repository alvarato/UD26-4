package main.services;

import java.util.List;

import main.dto.Reserva;

public interface IReservaService {

	public List<Reserva> findAll();
	
	public void create(Reserva reserva);
	
	public void update(Reserva reserva);
	
	public void deleteById(Long id);
}
