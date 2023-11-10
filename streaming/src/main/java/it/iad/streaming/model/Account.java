package it.iad.streaming.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "account")
public class Account {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "username")
	private String username;
	@Column(name = "nome_intestatario")
	private String nomeIntestatario;
	@Column(name = "cognome_intestatario")
	private String cognomeIntestatario;
	@Column(name = "nascita_intestatario")
	private Date nascitaIntestatario;
	@Column(name = "password")
	private String password;
	@OneToMany(mappedBy = "account", fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
	private List <Abbonamento> abbonamenti;
	
	public Account() {
		super();
	}
	public Account(Integer id, String username, String nomeIntestatario, String cognomeIntestatario,
			Date nascitaIntestatario, String password, List<Abbonamento> abbonamenti) {
		super();
		this.id = id;
		this.username = username;
		this.nomeIntestatario = nomeIntestatario;
		this.cognomeIntestatario = cognomeIntestatario;
		this.nascitaIntestatario = nascitaIntestatario;
		this.password = password;
		this.abbonamenti = abbonamenti;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNomeIntestatario() {
		return nomeIntestatario;
	}
	public void setNomeIntestatario(String nomeIntestatario) {
		this.nomeIntestatario = nomeIntestatario;
	}
	public String getCognomeIntestatario() {
		return cognomeIntestatario;
	}
	public void setCognomeIntestatario(String cognomeIntestatario) {
		this.cognomeIntestatario = cognomeIntestatario;
	}
	public Date getNascitaIntestatario() {
		return nascitaIntestatario;
	}
	public void setNascitaIntestatario(Date nascitaIntestatario) {
		this.nascitaIntestatario = nascitaIntestatario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Abbonamento> getAbbonamenti() {
		return abbonamenti;
	}
	public void setAbbonamenti(List<Abbonamento> abbonamenti) {
		this.abbonamenti = abbonamenti;
	}
	

}
