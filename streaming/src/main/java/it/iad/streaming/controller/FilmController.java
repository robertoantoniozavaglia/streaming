package it.iad.streaming.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.iad.streaming.model.Film;
import it.iad.streaming.service.FilmService;

@RestController
@RequestMapping("/film")
public class FilmController {

	@Autowired
	private FilmService filmService;
	
	@GetMapping (value = "/all")
	public List<Film> getAllFilms(){
		return filmService.getAllFilms();
	}

	@GetMapping (value = "/find")
	public Optional<Film> findById (@RequestParam Integer id) {
		return filmService.findById(id);
	}
	
	@PostMapping (value = "/add")
	public Film addFilm (@RequestBody Film film) {
		return filmService.saveFilm(film);
	}
	
	@DeleteMapping (value = "/delete/{id}")
	public void deleteFilm (@PathVariable Integer id) {
		filmService.deleteFilm(id);
	}

}
