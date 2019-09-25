package com.huamall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.huamall.biz.ParamBiz;

@RestController
public class ParamController {

	@Autowired
	private ParamBiz pb;

	public ParamBiz getPb() {
		return pb;
	}

	public void setPb(ParamBiz pb) {
		this.pb = pb;
	}

}