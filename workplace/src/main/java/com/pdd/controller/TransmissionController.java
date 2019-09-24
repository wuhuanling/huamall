package com.pdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pdd.biz.TransmissionBiz;

@RestController
public class TransmissionController {
	
	@Autowired
	private TransmissionBiz tb;

	public TransmissionBiz getTb() {
		return tb;
	}

	public void setTb(TransmissionBiz tb) {
		this.tb = tb;
	}
	
}