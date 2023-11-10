package it.iad.streaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.iad.streaming.model.Abbonamento;
import it.iad.streaming.repository.AbbonamentoRepository;

@Service
public class AbbonamentoService {

	@Autowired
	private AbbonamentoRepository abbonamentoRepository;

	public List<Abbonamento> getAllAbbonamentos() {
		return abbonamentoRepository.findAll();
	}

	public Optional<Abbonamento> findById(Integer id) {
		return abbonamentoRepository.findById(id);
	}

	public Abbonamento saveAbbonamento(Abbonamento abbonamento) {
		return abbonamentoRepository.save(abbonamento);
	}

	public void deleteAbbonamento(Integer id) {
		abbonamentoRepository.deleteById(id);
	}
}
