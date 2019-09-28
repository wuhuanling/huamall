package com.huamall.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huamall.biz.ScreenBiz;
import com.huamall.dao.ScreenMapper;

@Service
@Transactional
public class ScreenBizImpl implements ScreenBiz {

	@Autowired
	private ScreenMapper sm;
	
	
	public ScreenMapper getSm() {
		return sm;
	}


	public void setSm(ScreenMapper sm) {
		this.sm = sm;
	}


	@Override
	public String selectScreenByGoodstitle(String title) {
		// TODO Auto-generated method stub
		return sm.selectScreenByGoodstitle(title);
	}

}
