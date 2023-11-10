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
@Table (name = "serie")
public class Serie {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "titolo")
	private String titolo;
	@Column(name = "genere")
	private String genere;
	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "attore_serie", joinColumns = { @JoinColumn(name = "id_serie") }, inverseJoinColumns = {
			@JoinColumn(name = "id_attore") })
    private List<Attore> attori;
	@OneToMany(mappedBy = "serie", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List<Stagione> stagioni;
	@ManyToMany(mappedBy = "series")
	private List<Piano> piani;
	public Serie() {
		super();
	}
	public Serie(Integer id, String titolo, String genere, List<Attore> attori, List<Stagione> stagioni,
			List<Piano> piani) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.genere = genere;
		this.attori = attori;
		this.stagioni = stagioni;
		this.piani = piani;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public List<Attore> getAttori() {
		return attori;
	}
	public void setAttori(List<Attore> attori) {
		this.attori = attori;
	}
	public List<Stagione> getStagioni() {
		return stagioni;
	}
	public void setStagioni(List<Stagione> stagioni) {
		this.stagioni = stagioni;
	}
	public List<Piano> getPiani() {
		return piani;
	}
	public void setPiani(List<Piano> piani) {
		this.piani = piani;
	}
	
}
