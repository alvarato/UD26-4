package main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IEquipoDAO;
import main.dto.Equipo;

@Service
public class EquipoService implements IEquipoService {

	@Autowired
	IEquipoDAO dao;

	@Override
	public List<Equipo> findAll() {
		return dao.findAll();
	}

	@Override
	public void create(Equipo equipo) {
		dao.save(equipo);
	}

	@Override
	public void update(Equipo equipo) {
		Optional<Equipo> aux = dao.findById(equipo.getNumSerie());
		if(aux != null) {
			dao.save(equipo);
		}
	}

	@Override
	public void deleteById(String numSerie) {
		dao.deleteById(numSerie);
	}
}
