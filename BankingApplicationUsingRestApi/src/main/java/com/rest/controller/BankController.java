package com.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Bank;
import com.rest.service.BankService;

@RestController
public class BankController {
	@Autowired
	private BankService bankService;
@PostMapping("/save")
public String saveRecord(@RequestBody Bank bank) {
	Bank bank2=bankService.saveNewUser(bank);
	String msg=null;
	if(bank2!=null) {
		msg="data inserted";
	}
	else {
		msg="data not inserted";
	}
	return msg;
}
}
