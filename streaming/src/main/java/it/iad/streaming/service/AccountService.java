package it.iad.streaming.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.iad.streaming.model.Account;
import it.iad.streaming.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public List<Account> getAllAccounts() {
		return accountRepository.findAll();
	}

	public Optional<Account> findById(Integer id) {
		return accountRepository.findById(id);
	}

	public Account saveAccount(Account account) {
		return accountRepository.save(account);
	}

	public void deleteAccount(Integer id) {
		accountRepository.deleteById(id);
	}

	public boolean verifyLogin(String username, String password) {
		Account account = accountRepository.findByUsername(username);
		if (account == null) {
			return false;
		}
		if (!password.equals(account.getPassword())) {
			return false;
		}
		return true;
	}
	
}
