package com.huamall.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huamall.biz.ColorBiz;

@CrossOrigin
@RequestMapping("/color")
@RestController
public class ColorController {

	private ColorBiz cb;

	public ColorBiz getCb() {
		return cb;
	}

	public void setCb(ColorBiz cb) {
		this.cb = cb;
	}
	
	@GetMapping("/{code}")
	 public String selectColorByCode(@PathVariable(value = "code") String code ) {
		 System.out.println();
		 return cb.selectColorByCode(code);
	 }
	
}
