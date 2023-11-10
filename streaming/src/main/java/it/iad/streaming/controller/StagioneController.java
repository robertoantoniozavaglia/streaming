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

import it.iad.streaming.model.Stagione;
import it.iad.streaming.service.StagioneService;

@RestController
@RequestMapping("/stagione")
public class StagioneController {
	
	@Autowired
	private StagioneService stagioneService;
	
	@GetMapping (value = "/all")
	public List<Stagione> getAllStagiones(){
		return stagioneService.getAllStagiones();
	}

	@GetMapping (value = "/find")
	public Optional<Stagione> findById (@RequestParam Integer id) {
		return stagioneService.findById(id);
	}
	
	@PostMapping (value = "/add")
	public Stagione addStagione (@RequestBody Stagione stagione) {
		return stagioneService.saveStagione(stagione);
	}
	
	@DeleteMapping (value = "/delete/{id}")
	public void deleteStagione (@PathVariable Integer id) {
		stagioneService.deleteStagione(id);
	}

}
