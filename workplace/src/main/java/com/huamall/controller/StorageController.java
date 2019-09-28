package com.huamall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huamall.biz.StorageBiz;

@RequestMapping("/storage")
@CrossOrigin
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

	@GetMapping("/{title}")
	 public String selectStorageByGoodstitle(@PathVariable(value = "title") String title ) {
		 System.out.println();
		 return sb.selectStorageByGoodstitle(title);
	 }
}
