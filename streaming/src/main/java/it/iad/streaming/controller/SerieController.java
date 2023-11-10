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

import it.iad.streaming.model.Serie;
import it.iad.streaming.service.SerieService;

@RestController
@RequestMapping("/serie")
public class SerieController {

	@Autowired
	private SerieService serieService;
	
	@GetMapping (value = "/all")
	public List<Serie> getAllSeries(){
		return serieService.getAllSeries();
	}

	@GetMapping (value = "/find")
	public Optional<Serie> findById (@RequestParam Integer id) {
		return serieService.findById(id);
	}
	
	@PostMapping (value = "/add")
	public Serie addSerie (@RequestBody Serie serie) {
		return serieService.saveSerie(serie);
	}
	
	@DeleteMapping (value = "/delete/{id}")
	public void deleteSerie (@PathVariable Integer id) {
		serieService.deleteSerie(id);
	}

}
