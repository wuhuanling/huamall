package com.pdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.pdd.biz.ShootingBiz;

@RestController
public class ShootingController {

	@Autowired
	private ShootingBiz sb;

	public ShootingBiz getSb() {
		return sb;
	}

	public void setSb(ShootingBiz sb) {
		this.sb = sb;
	}
	
}
