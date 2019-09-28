package com.huamall.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huamall.biz.ShootingBiz;
import com.huamall.dao.ShootingMapper;

@Service
@Transactional
public class ShootingBizImpl implements ShootingBiz {

	@Autowired
	private ShootingMapper sm;
	

	public ShootingMapper getSm() {
		return sm;
	}


	public void setSm(ShootingMapper sm) {
		this.sm = sm;
	}


	@Override
	public String selectShootingByGoodstitle(String title) {
		// TODO Auto-generated method stub
		return sm.selectShootingByGoodstitle(title);
	}

}
