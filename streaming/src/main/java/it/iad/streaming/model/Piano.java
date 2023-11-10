package it.iad.streaming.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "piano")
public class Piano {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "tipologia")
	private String tipologia;
	@Column(name = "descrizione")
	private String descrizione;
	@Column(name = "costo")
	private Float costo;
	@JsonIgnore
	@OneToMany(mappedBy = "piano", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<Abbonamento> abbonamenti;
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "piano_film", joinColumns = { @JoinColumn(name = "id_piano") }, inverseJoinColumns = {
			@JoinColumn(name = "id_film") })
	private List<Film> films;
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "piano_serie", joinColumns = { @JoinColumn(name = "id_piano") }, inverseJoinColumns = {
			@JoinColumn(name = "id_serie") })
	private List<Serie> series;

	public Piano() {
		super();
	}

	public Piano(Integer id, String tipologia, String descrizione, Float costo, List<Abbonamento> abbonamenti,
			List<Film> films, List<Serie> series) {
		super();
		this.id = id;
		this.tipologia = tipologia;
		this.descrizione = descrizione;
		this.costo = costo;
		this.abbonamenti = abbonamenti;
		this.films = films;
		this.series = series;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public Float getCosto() {
		return costo;
	}

	public void setCosto(Float costo) {
		this.costo = costo;
	}

	public List<Abbonamento> getAbbonamenti() {
		return abbonamenti;
	}

	public void setAbbonamenti(List<Abbonamento> abbonamenti) {
		this.abbonamenti = abbonamenti;
	}

	public List<Film> getFilms() {
		return films;
	}

	public void setFilms(List<Film> films) {
		this.films = films;
	}

	public List<Serie> getSeries() {
		return series;
	}

	public void setSeries(List<Serie> series) {
		this.series = series;
	}

}
