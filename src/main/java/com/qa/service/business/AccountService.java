package com.qa.service.business;

public interface AccountService {

	String getAllAccounts();

	String createAnAccount(String account);

	String deleteAnAccount(Long id);

	String findAnAccount(Long id);
}
