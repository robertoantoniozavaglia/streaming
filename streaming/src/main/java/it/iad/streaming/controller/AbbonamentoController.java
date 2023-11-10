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

import it.iad.streaming.model.Abbonamento;
import it.iad.streaming.service.AbbonamentoService;

@RestController
@RequestMapping("/abbonamento")
public class AbbonamentoController {
	
	@Autowired
	private AbbonamentoService abbonamentoService;
	
	@GetMapping (value = "/all")
	public List<Abbonamento> getAllAbbonamentos(){
		return abbonamentoService.getAllAbbonamentos();
	}

	@GetMapping (value = "/find")
	public Optional<Abbonamento> findById (@RequestParam Integer id) {
		return abbonamentoService.findById(id);
	}
	
	@PostMapping (value = "/add")
	public Abbonamento addAbbonamento (@RequestBody Abbonamento abbonamento) {
		return abbonamentoService.saveAbbonamento(abbonamento);
	}
	
	@DeleteMapping (value = "/delete/{id}")
	public void deleteAbbonamento (@PathVariable Integer id) {
		abbonamentoService.deleteAbbonamento(id);
	}

}
