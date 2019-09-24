package com.pdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pdd.biz.ScreenBiz;

@RestController
public class ScreenController {

	@Autowired
	private ScreenBiz sb;

	public ScreenBiz getSb() {
		return sb;
	}

	public void setSb(ScreenBiz sb) {
		this.sb = sb;
	}
	
}
