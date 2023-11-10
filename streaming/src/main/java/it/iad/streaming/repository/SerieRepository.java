package it.iad.streaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.iad.streaming.model.Serie;

@Repository
public interface SerieRepository extends JpaRepository<Serie, Integer>{

}
