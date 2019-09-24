package com.pdd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pdd.biz.UsersBiz;
import com.pdd.entity.Users;

@RestController
@RequestMapping("/api")
public class UsersController {

	@Autowired
private	UsersBiz ub;
	
	
	public UsersBiz getUb() {
		return ub;
	}


	public void setUb(UsersBiz ub) {
		this.ub = ub;
	}


	@RequestMapping("/login")
	public  Users login(@RequestBody String username,String password ) {
		Users u = ub.checkLogin(username, password);
		if(u!=null) {
			return u;
			
		}else {
			return null;
		}

	}
	@RequestMapping("/regedit")
	public String regedit(@RequestBody Users u) {
		
		int flag = ub.regedit(u);
		if(flag>0) {
			return "success";
		}
		return "error";
		
		
	}
		
	
}
