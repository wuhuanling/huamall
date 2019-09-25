package com.huamall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.huamall.biz.AddressBiz;

@RestController
public class AddressController {

	@Autowired
	private AddressBiz ab;

	public AddressBiz getAb() {
		return ab;
	}
//aa
	public void setAb(AddressBiz ab) {
		this.ab = ab;
	}


}
