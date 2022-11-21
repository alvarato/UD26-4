package main.services;

import java.util.List;

import main.dto.Facultad;

public interface IFacultadService {

	public List<Facultad> findAll();
	
	public void create(Facultad facultad);
	
	public void update(Facultad facultad);
	
	public void deleteById(Long codigo);
}
