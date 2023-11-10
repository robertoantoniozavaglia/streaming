package it.iad.streaming.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.iad.streaming.model.Account;
import it.iad.streaming.service.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping(value = "/all")
	public List<Account> getAllAccounts() {
		return accountService.getAllAccounts();
	}

	@GetMapping(value = "/find")
	public Optional<Account> findById(@RequestParam Integer id) {
		return accountService.findById(id);
	}

	@PostMapping(value = "/add")
	public Account addAccount(@RequestBody Account account) {
		return accountService.saveAccount(account);
	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteAccount(@PathVariable Integer id) {
		accountService.deleteAccount(id);
	}

	@PostMapping(value = "/login")
	public String login(@RequestParam String username, @RequestParam String password) {
		boolean loginSuccess = accountService.verifyLogin(username, password);
		if (loginSuccess) {
			return "Login effettuato con successo!";
		} else {
			return "Username o password errati.";
		}
	}
	
	//METODO PER RESETTARE LA PASSWORD

}
