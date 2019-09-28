package com.huamall.biz.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huamall.biz.StandardBiz;
import com.huamall.dao.StandardMapper;

@Service
@Transactional
public class StandardBizImpl implements StandardBiz {

	private StandardMapper sm;
	

	public StandardMapper getSm() {
		return sm;
	}


	public void setSm(StandardMapper sm) {
		this.sm = sm;
	}

	@Override
	public String selectStandardByCode(String code) {
		// TODO Auto-generated method stub
		return sm.selectStandardByCode(code);
	}

}
