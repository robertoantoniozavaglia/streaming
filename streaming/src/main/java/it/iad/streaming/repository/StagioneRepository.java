package it.iad.streaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.iad.streaming.model.Stagione;

@Repository
public interface StagioneRepository extends JpaRepository<Stagione, Integer> {

}


