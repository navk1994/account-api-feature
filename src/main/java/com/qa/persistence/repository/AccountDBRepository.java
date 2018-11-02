package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Account;
import com.qa.util.JSONUtil;

@Default
@Transactional //(SUPPORTS)
public class AccountDBRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	
	
	public Account findAccount(Long id)
	{
		return manager.find(Account.class, id);
	}
	
	
	public String getAllAccounts() 
	{
		Query query = manager.createQuery("Select a FROM Account a");
		Collection<Account> account = (Collection<Account>) query.getResultList();
return util.getJSONForObject(account);
	}
	
	
	@Transactional //(REQUIRED)
	
	public String createAnAccount(String account) 
	{
		
		Account aAccount = util.getObjectForJSON(account, Account.class);
		manager.persist(aAccount);
		return "{\"message\": \"Account sucessfully added\"}";

	}
	
	public void updateAnAccount(Long id) 
	{
		Account aAccount = manager.find(Account.class, id);
		
		if(aAccount != null)
		{
			aAccount.setFirstName("POJO");
			aAccount.setLastName("Maximus");
	
			
		}
	}
	
	public String deleteAnAccount(Long id) 
	{
		Account aAccount = manager.find(Account.class, id);
		
		if(aAccount != null) 
		{
			manager.remove(aAccount);
		}
		return "{\"message\": \"account sucessfully deleted\"}";
	
	}		
}

