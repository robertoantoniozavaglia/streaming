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

import it.iad.streaming.model.Attore;
import it.iad.streaming.service.AttoreService;

@RestController
@RequestMapping("/attore")
public class AttoreController {
	
	@Autowired
	private AttoreService attoreService;
	
	@GetMapping (value = "/all")
	public List<Attore> getAllAttori(){
		return attoreService.getAllAttori();
	}

	@GetMapping (value = "/find")
	public Optional<Attore> findById (@RequestParam Integer id) {
		return attoreService.findById(id);
	}
	
	@PostMapping (value = "/add")
	public Attore addAttore (@RequestBody Attore attore) {
		return attoreService.saveAttore(attore);
	}
	
	@DeleteMapping (value = "/delete/{id}")
	public void deleteAttore (@PathVariable Integer id) {
		attoreService.deleteAttore(id);
	}

}
