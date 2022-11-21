package main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IInvestigadorDAO;
import main.dto.Investigador;

@Service
public class InvestigadorService implements IInvestigadorService{

	@Autowired
	IInvestigadorDAO dao;
	
	@Override
	public List<Investigador> findAll() {
		return dao.findAll();
	}

	@Override
	public void create(Investigador investigador) {
		dao.save(investigador);
	}

	@Override
	public void update(Investigador investigador) {
		Optional<Investigador> aux = dao.findById(investigador.getDni());
		if(aux != null) {
			dao.save(investigador);
		}

	}

	@Override
	public void deleteById(String dni) {
		dao.deleteById(dni);
	}

}
