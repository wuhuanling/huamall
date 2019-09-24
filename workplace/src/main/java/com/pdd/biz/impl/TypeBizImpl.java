package com.pdd.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pdd.biz.TypeBiz;
import com.pdd.dao.TypeMapper;
import com.pdd.entity.Type;

@Service
@Transactional
public class TypeBizImpl implements TypeBiz {

	@Autowired
	private TypeMapper tm;
	public TypeMapper getTm() {
		return tm;
	}
	
	public void setTm(TypeMapper tm) {
		this.tm = tm;
	}


	@Override
	public List<Type> selectChileByInfo(String info) {
		// TODO Auto-generated method stub
		return tm.selectChileByInfo(info);
	}

}
