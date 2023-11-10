package it.iad.streaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.iad.streaming.model.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Integer>{

}
