package com.huamall.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huamall.biz.TransmissionBiz;
import com.huamall.dao.TransmissionMapper;

@Service
@Transactional
public class TransmissionBizImpl implements TransmissionBiz {

	@Autowired
	private TransmissionMapper tm; ;
	


	public TransmissionMapper getTm() {
		return tm;
	}



	public void setTm(TransmissionMapper tm) {
		this.tm = tm;
	}



	@Override
	public String selectTransmissionByGoodstitle(String title) {
		// TODO Auto-generated method stub
		return tm.selectTransmissionByGoodstitle(title);
	}

}
