package com.huamall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huamall.biz.ShootingBiz;

@RequestMapping("/shooting")
@CrossOrigin
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

	 
		@GetMapping("/{title}")
		 public String selectShootingByGoodstitle(@PathVariable(value = "title") String title) {
			 System.out.println();
			 return sb.selectShootingByGoodstitle(title);
		 }
		
		
}
