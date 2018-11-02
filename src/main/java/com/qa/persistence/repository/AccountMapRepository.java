package com.qa.persistence.repository;

import java.util.HashMap;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

import com.qa.persistence.domain.Account;

@ApplicationScoped
@Alternative
public class AccountMapRepository implements AccountRepository {

	int counter = 0;
	HashMap<Integer, Account> bankAccounts = new HashMap<Integer, Account>();
	
	public String getAllAccounts() {
		// TODO Auto-generated method stub
		return null;
	}
	public String createAnAccount(String account) {
		// TODO Auto-generated method stub
		return null;
	}
	public String deleteAnAccount(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	public String findAnAccount(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
