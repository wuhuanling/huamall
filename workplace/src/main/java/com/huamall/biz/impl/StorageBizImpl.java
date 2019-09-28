package com.huamall.biz.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huamall.biz.StorageBiz;
import com.huamall.dao.StorageMapper;

@Service
@Transactional
public class StorageBizImpl implements StorageBiz {

	private StorageMapper sm;
	
	
	public StorageMapper getSm() {
		return sm;
	}


	public void setSm(StorageMapper sm) {
		this.sm = sm;
	}


	@Override
	public String selectStorageByGoodstitle(String title) {
		// TODO Auto-generated method stub
		return sm.selectStorageByGoodstitle(title);
	}

}
