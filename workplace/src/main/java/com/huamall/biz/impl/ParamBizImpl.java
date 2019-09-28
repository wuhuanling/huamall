package com.huamall.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huamall.biz.ParamBiz;
import com.huamall.dao.ParamMapper;

@Service
@Transactional
public class ParamBizImpl implements ParamBiz {

	@Autowired
	private ParamMapper pm;
	


	public ParamMapper getPm() {
		return pm;
	}



	public void setPm(ParamMapper pm) {
		this.pm = pm;
	}



	@Override
	public String selectParamByGoodstitle(String title) {
		// TODO Auto-generated method stub
		return pm.selectParamByGoodstitle(title);
	}

}
