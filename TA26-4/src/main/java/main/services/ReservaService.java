package main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.IReservaDAO;
import main.dto.Reserva;

@Service
public class ReservaService implements IReservaService{

	@Autowired
	IReservaDAO dao;
	
	@Override
	public List<Reserva> findAll() {
		return dao.findAll();
	}

	@Override
	public void create(Reserva reserva) {
		dao.save(reserva);
		}
	
	@Override
	public void update(Reserva reserva) {
		Optional<Reserva> aux = dao.findById(reserva.getId());
		if(aux != null)dao.save(reserva);
	}

	@Override
	public void deleteById(Long id) {
		dao.deleteById(id);
	}

}
