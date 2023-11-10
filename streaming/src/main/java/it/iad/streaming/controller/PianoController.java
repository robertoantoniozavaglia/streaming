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

import it.iad.streaming.model.Piano;
import it.iad.streaming.service.PianoService;

@RestController
@RequestMapping("/piano")
public class PianoController {
	
	@Autowired
	private PianoService pianoService;
	
	@GetMapping (value = "/all")
	public List<Piano> getAllPianos(){
		return pianoService.getAllPianos();
	}

	@GetMapping (value = "/find")
	public Optional<Piano> findById (@RequestParam Integer id) {
		return pianoService.findById(id);
	}
	
	@PostMapping (value = "/add")
	public Piano addPiano (@RequestBody Piano piano) {
		return pianoService.savePiano(piano);
	}
	
	@DeleteMapping (value = "/delete/{id}")
	public void deletePiano (@PathVariable Integer id) {
		pianoService.deletePiano(id);
	}

}
