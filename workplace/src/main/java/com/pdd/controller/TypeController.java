package com.pdd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pdd.biz.TypeBiz;
import com.pdd.entity.Type;
@CrossOrigin
@RestController
public class TypeController {

	@Autowired
	private TypeBiz tb;

	public TypeBiz getTb() {
		return tb;
	}

	public void setTb(TypeBiz tb) {
		this.tb = tb;
	}
	
	@RequestMapping("/selectchile")

	public List<Type> selectChileByInfo(String info) {
		return tb.selectChileByInfo("手机");
	}
}
