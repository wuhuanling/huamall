package com.huamall.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huamall.biz.ColorBiz;
import com.huamall.dao.ColorMapper;

@Service
@Transactional
public class ColorBizImpl implements ColorBiz {

	@Autowired
	private ColorMapper cm;
	
	



	public ColorMapper getCm() {
		return cm;
	}





	public void setCm(ColorMapper cm) {
		this.cm = cm;
	}





	@Override
	public String selectColorByCode(String code) {
		// TODO Auto-generated method stub
		return cm.selectColorByCode(code);
	}

}
