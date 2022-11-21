package main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IFacultadDAO;
import main.dto.Facultad;

@Service
public class FacultadService implements IFacultadService{

	@Autowired
	IFacultadDAO dao;

	@Override
	public List<Facultad> findAll() {
		return dao.findAll();
	}

	@Override
	public void create(Facultad facultad) {
		dao.save(facultad);
	}

	@Override
	public void update(Facultad facultad) {
		Optional<Facultad> aux = dao.findById(facultad.getCodigo());
		if(aux != null) dao.save(facultad);
	}

	@Override
	public void deleteById(Long codigo) {
		dao.deleteById(codigo);
	}
	
	
}
