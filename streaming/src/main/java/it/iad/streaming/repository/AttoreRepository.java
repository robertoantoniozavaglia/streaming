package it.iad.streaming.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.iad.streaming.model.Attore;

@Repository
public interface AttoreRepository extends JpaRepository<Attore, Integer> {

}
