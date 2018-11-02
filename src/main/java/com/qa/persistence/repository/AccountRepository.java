package com.qa.persistence.repository;

public interface AccountRepository {

	String getAllAccounts();

	String createAnAccount(String account);

	String deleteAnAccount(Long id);

	String findAnAccount(Long id);

}
