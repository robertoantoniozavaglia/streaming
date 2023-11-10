package it.iad.streaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.iad.streaming.model.Attore;
import it.iad.streaming.repository.AttoreRepository;

@Service
public class AttoreService {
	
	@Autowired
	private AttoreRepository attoreRepository;

	public List<Attore> getAllAttori() {
		return attoreRepository.findAll();
	}

	public Optional<Attore> findById(Integer id) {
		return attoreRepository.findById(id);
	}

	public Attore saveAttore(Attore attore) {
		return attoreRepository.save(attore);
	}

	public void deleteAttore(Integer id) {
		attoreRepository.deleteById(id);
	}

}
