package it.iad.streaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.iad.streaming.model.Piano;

@Repository
public interface PianoRepository extends JpaRepository<Piano, Integer>{

}
