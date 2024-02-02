package com.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Bank;
import com.rest.repo.BankRepo;

@Services
public class BankImp implements BankService {
@Autowired
private BankRepo bankRepo;
	@Override
	public String saveNewRecord(Bank bank){
		bank.setAccount_status(true);
		Bank save=bankRepo.save(bank);
		return save;
	}

}
