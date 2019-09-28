package com.huamall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huamall.biz.StandardBiz;

@CrossOrigin
@RestController
@RequestMapping("/standard")
public class StandardController {


	@Autowired
    private StandardBiz sb;


	 
	public StandardBiz getSb() {
		return sb;
	}



	public void setSb(StandardBiz sb) {
		this.sb = sb;
	}



	@GetMapping("/{code}")
	public String selectStandardByCode(@PathVariable(value = "code") String code) {
	 System.out.println();
	return sb.selectStandardByCode(code);
	  }
}
