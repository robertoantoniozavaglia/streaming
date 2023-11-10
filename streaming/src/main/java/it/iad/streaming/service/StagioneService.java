package it.iad.streaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.iad.streaming.model.Stagione;
import it.iad.streaming.repository.StagioneRepository;

@Service
public class StagioneService {
	
	@Autowired
	private StagioneRepository stagioneRepository;

	public List<Stagione> getAllStagiones() {
		return stagioneRepository.findAll();
	}

	public Optional<Stagione> findById(Integer id) {
		return stagioneRepository.findById(id);
	}

	public Stagione saveStagione(Stagione stagione) {
		return stagioneRepository.save(stagione);
	}

	public void deleteStagione(Integer id) {
		stagioneRepository.deleteById(id);
	}

}
