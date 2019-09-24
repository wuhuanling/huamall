package com.pdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pdd.biz.TypeBiz;

@RestController
public class TypeController {

	@Autowired
	private TypeBiz tb;

	public TypeBiz getTb() {
		return tb;
	}

	public void setTb(TypeBiz tb) {
		this.tb = tb;
	}
	
}
