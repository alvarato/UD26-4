package main.services;

import java.util.List;


import main.dto.Investigador;

public interface IInvestigadorService {

	public List<Investigador> findAll();
	
	public void create(Investigador investigador);
	
	public void update(Investigador investigador);
	
	public void deleteById(String dni);
}
