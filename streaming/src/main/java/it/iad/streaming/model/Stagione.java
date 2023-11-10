package it.iad.streaming.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "stagione")
public class Stagione {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "numero_stagione")
	private Integer numeroStagione;
	@Column(name = "numero_episodi")
	private Integer numeroEpisodi;
	@Column(name = "durata_episodi")
	private Integer durataEpisodi;
	@Column(name = "anno_uscita")
	private Integer annoUscita;
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_serie")
	private Serie serie;
	public Stagione() {
		super();
	}
	public Stagione(Integer id, Integer numeroStagione, Integer numeroEpisodi, Integer durataEpisodi,
			Integer annoUscita, Serie serie) {
		super();
		this.id = id;
		this.numeroStagione = numeroStagione;
		this.numeroEpisodi = numeroEpisodi;
		this.durataEpisodi = durataEpisodi;
		this.annoUscita = annoUscita;
		this.serie = serie;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumeroStagione() {
		return numeroStagione;
	}
	public void setNumeroStagione(Integer numeroStagione) {
		this.numeroStagione = numeroStagione;
	}
	public Integer getNumeroEpisodi() {
		return numeroEpisodi;
	}
	public void setNumeroEpisodi(Integer numeroEpisodi) {
		this.numeroEpisodi = numeroEpisodi;
	}
	public Integer getDurataEpisodi() {
		return durataEpisodi;
	}
	public void setDurataEpisodi(Integer durataEpisodi) {
		this.durataEpisodi = durataEpisodi;
	}
	public Integer getAnnoUscita() {
		return annoUscita;
	}
	public void setAnnoUscita(Integer annoUscita) {
		this.annoUscita = annoUscita;
	}
	public Serie getSerie() {
		return serie;
	}
	public void setSerie(Serie serie) {
		this.serie = serie;
	}
	
}
