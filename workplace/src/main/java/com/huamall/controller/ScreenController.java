package com.huamall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huamall.biz.ScreenBiz;

@CrossOrigin
@RequestMapping("/screen")
@RestController
public class ScreenController {

	@Autowired
	private ScreenBiz sb;

	public ScreenBiz getSb() {
		return sb;
	}

	public void setSb(ScreenBiz sb) {
		this.sb = sb;
	}

	@GetMapping("/{title}")
	 public String selectScreenByGoodstitle(@PathVariable(value = "title") String title) {
		 System.out.println();
		 return sb.selectScreenByGoodstitle(title);
	 }
}
