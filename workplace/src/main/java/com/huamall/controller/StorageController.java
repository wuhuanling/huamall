package com.huamall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.huamall.biz.StorageBiz;

@RestController
public class StorageController {

	@Autowired
	private StorageBiz sb;

	public StorageBiz getSb() {
		return sb;
	}

	public void setSb(StorageBiz sb) {
		this.sb = sb;
	}

}
