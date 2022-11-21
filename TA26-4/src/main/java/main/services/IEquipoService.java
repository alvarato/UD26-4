package main.services;

import java.util.List;

import main.dto.Equipo;

public interface IEquipoService {

	public List<Equipo> findAll();
	
	public void create(Equipo equipo);
	
	public void update(Equipo equipo);
	
	public void deleteById(String numSerie);
}
