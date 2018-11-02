package com.qa.service.business;

import javax.inject.Inject;

import com.qa.persistence.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {

	@Inject
	private AccountRepository repo;
	
	public String getAllAccounts() {
		return repo.getAllAccounts();
	}

	public String createAnAccount(String account) {
		return repo.createAnAccount(account);
	}

	public String deleteAnAccount(Long id) {
		return repo.deleteAnAccount(id);
	}

	public String findAnAccount(Long id) {
		return repo.findAnAccount(id);
	}
	
	public void setRepo(AccountRepository repo) {
		this.repo = repo;
}
}
