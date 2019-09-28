package com.huamall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huamall.biz.ParamBiz;

@RequestMapping("/param")
@CrossOrigin
@RestController
public class ParamController {

	@Autowired
	private ParamBiz pb;

	public ParamBiz getPb() {
		return pb;
	}

	public void setPb(ParamBiz pb) {
		this.pb = pb;
	}

	@GetMapping("/{title}")
	 public String selectParamByGoodstitle(@PathVariable(value = "title") String title) {
		 System.out.println();
		 return pb.selectParamByGoodstitle(title);
	 }
}
