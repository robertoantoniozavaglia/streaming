package it.iad.streaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.iad.streaming.model.Serie;
import it.iad.streaming.repository.SerieRepository;

@Service
public class SerieService {
	@Autowired
	private SerieRepository serieRepository;

	public List<Serie> getAllSeries() {
		return serieRepository.findAll();
	}

	public Optional<Serie> findById(Integer id) {
		return serieRepository.findById(id);
	}

	public Serie saveSerie(Serie serie) {
		return serieRepository.save(serie);
	}

	public void deleteSerie(Integer id) {
		serieRepository.deleteById(id);
	}

}
