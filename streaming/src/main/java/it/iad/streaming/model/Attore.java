package it.iad.streaming.model;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "attore")
public class Attore {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "nome")
	private String nome;
	@Column(name = "cognome")
	private String cognome;
	@Column(name = "data_nascita")
	private Date dataNascita;
	//mappatura DTO
	@JsonIgnore
	@ManyToMany(mappedBy = "attori")
	private List<Film> filmografiaCinema;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "attori")
	private List <Serie> filmografiaTelevisione;
	
	public Attore() {
		super();
	}
	public Attore(Integer id, String nome, String cognome, Date dataNascita, List<Film> filmografiaCinema,
			List<Serie> filmografiaTelevisione) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.filmografiaCinema = filmografiaCinema;
		this.filmografiaTelevisione = filmografiaTelevisione;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public Date getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}
	public List<Film> getFilmografiaCinema() {
		return filmografiaCinema;
	}
	public void setFilmografiaCinema(List<Film> filmografiaCinema) {
		this.filmografiaCinema = filmografiaCinema;
	}
	public List<Serie> getFilmografiaTelevisione() {
		return filmografiaTelevisione;
	}
	public void setFilmografiaTelevisione(List<Serie> filmografiaTelevisione) {
		this.filmografiaTelevisione = filmografiaTelevisione;
	}
	
}
