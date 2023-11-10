package it.iad.streaming.model;

import java.sql.Date;

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
@Table (name = "abbonamento")
public class Abbonamento {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "inizio_abbonamento")
	private Date inizioAbbonamento;
	@Column(name = "fine_abbonamento")
	private Date fineAbbonamento;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_account")
	private Account account;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "id_piano")
	private Piano piano;
	public Abbonamento() {
		super();
	}
	public Abbonamento(Integer id, Date inizioAbbonamento, Date fineAbbonamento, Account account, Piano piano) {
		super();
		this.id = id;
		this.inizioAbbonamento = inizioAbbonamento;
		this.fineAbbonamento = fineAbbonamento;
		this.account = account;
		this.piano = piano;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getInizioAbbonamento() {
		return inizioAbbonamento;
	}
	public void setInizioAbbonamento(Date inizioAbbonamento) {
		this.inizioAbbonamento = inizioAbbonamento;
	}
	public Date getFineAbbonamento() {
		return fineAbbonamento;
	}
	public void setFineAbbonamento(Date fineAbbonamento) {
		this.fineAbbonamento = fineAbbonamento;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Piano getPiano() {
		return piano;
	}
	public void setPiano(Piano piano) {
		this.piano = piano;
	}
	
}
