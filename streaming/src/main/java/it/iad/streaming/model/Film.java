package it.iad.streaming.model;

import java.util.List;

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
import jakarta.persistence.Table;

@Entity
@Table(name = "film")
public class Film {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "titolo")
	private String titolo;
	@Column(name = "genere")
	private String genere;
	@Column(name = "anno_uscita")
	private Integer annoUscita;
	@Column(name = "durata")
	private Integer durata;
	@Column(name = "anteprima")
	private boolean anteprima;
    @ManyToMany(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
    @JoinTable(name = "attore_film", joinColumns = { @JoinColumn(name = "id_film") }, inverseJoinColumns = {
            @JoinColumn(name = "id_attore") })
	private List<Attore> attori;
	@ManyToMany(mappedBy = "films")
	private List<Piano> piani;

	public Film() {
		super();
	}

	public Film(Integer id, String titolo, String genere, Integer annoUscita, Integer durata, boolean anteprima,
			List<Attore> attori, List<Piano> piani) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.genere = genere;
		this.annoUscita = annoUscita;
		this.durata = durata;
		this.anteprima = anteprima;
		this.attori = attori;
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

	public Integer getAnnoUscita() {
		return annoUscita;
	}

	public void setAnnoUscita(Integer annoUscita) {
		this.annoUscita = annoUscita;
	}

	public Integer getDurata() {
		return durata;
	}

	public void setDurata(Integer durata) {
		this.durata = durata;
	}

	public boolean isAnteprima() {
		return anteprima;
	}

	public void setAnteprima(boolean anteprima) {
		this.anteprima = anteprima;
	}

	public List<Attore> getAttori() {
		return attori;
	}

	public void setAttori(List<Attore> attori) {
		this.attori = attori;
	}

	public List<Piano> getPiani() {
		return piani;
	}

	public void setPiani(List<Piano> piani) {
		this.piani = piani;
	}

}
