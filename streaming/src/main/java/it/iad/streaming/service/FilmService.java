package it.iad.streaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.iad.streaming.model.Film;
import it.iad.streaming.repository.FilmRepository;

@Service
public class FilmService {

	@Autowired
	private FilmRepository filmRepository;

	public List<Film> getAllFilms() {
		return filmRepository.findAll();
	}

	public Optional<Film> findById(Integer id) {
		return filmRepository.findById(id);
	}

	public Film saveFilm(Film film) {
		return filmRepository.save(film);
	}

	public void deleteFilm(Integer id) {
		filmRepository.deleteById(id);
	}
}
