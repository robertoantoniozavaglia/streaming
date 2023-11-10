package it.iad.streaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.iad.streaming.model.Piano;
import it.iad.streaming.repository.PianoRepository;

@Service
public class PianoService {
	
	@Autowired
	private PianoRepository pianoRepository;

	public List<Piano> getAllPianos() {
		return pianoRepository.findAll();
	}

	public Optional<Piano> findById(Integer id) {
		return pianoRepository.findById(id);
	}

	public Piano savePiano(Piano piano) {
		return pianoRepository.save(piano);
	}

	public void deletePiano(Integer id) {
		pianoRepository.deleteById(id);
	}

}
