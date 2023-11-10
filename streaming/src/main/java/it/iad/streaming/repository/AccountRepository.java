package it.iad.streaming.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.iad.streaming.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

	Account findByUsername(String username);


}
  
