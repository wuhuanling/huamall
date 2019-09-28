package com.huamall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huamall.biz.TransmissionBiz;

@RequestMapping("/transmission")
@CrossOrigin
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

	@GetMapping("/{title}")
	 public String selectTransmissionByGoodstitle(@PathVariable(value = "title") String title ) {
		 System.out.println();
		 return tb.selectTransmissionByGoodstitle(title);
	 }
}
