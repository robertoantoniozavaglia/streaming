package it.iad.streaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.iad.streaming.model.Abbonamento;

@Repository
public interface AbbonamentoRepository extends JpaRepository<Abbonamento, Integer>{

}
