package com.huamall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huamall.biz.UsersBiz;
import com.huamall.entity.Users;

@CrossOrigin
@RestController
@RequestMapping("/user")
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
	public  Users login(String username,String password ) {

		username="aaa";
		password="123";
		Users u = ub.checkLogin(username, password);
		System.out.println("方法");
		if(u!=null) {
			System.out.println(u.toString());
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
