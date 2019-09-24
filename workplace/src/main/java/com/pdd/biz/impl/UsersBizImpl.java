package com.pdd.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pdd.biz.UsersBiz;
import com.pdd.dao.UsersMapper;
import com.pdd.entity.Users;

@Service
public class UsersBizImpl implements UsersBiz {
@Autowired
private UsersMapper um;
	
	
	public UsersMapper getUm() {
	return um;
}


public void setUm(UsersMapper um) {
	this.um = um;
}


	@Override
	public Users checkLogin(String username, String password) {
		// TODO Auto-generated method stub
		return um.selectByUnameAndPwd(username, password) ;
	}


	@Override
	public void regedit(Users u) {
		// TODO Auto-generated method stub
		
	}

}
