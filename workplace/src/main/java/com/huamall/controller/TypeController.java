package com.huamall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.huamall.biz.TypeBiz;
import com.huamall.entity.Type;
@CrossOrigin
@RestController
@RequestMapping("/type")
public class TypeController {

	@Autowired
	private TypeBiz tb;

	public TypeBiz getTb() {
		return tb;
	}

	public void setTb(TypeBiz tb) {
		this.tb = tb;
	}

	@GetMapping("/{info}")
	public List<Type> selectChildByInfo(@PathVariable(value = "info") String info) {
		System.out.println(info);
		return tb.selectChildByInfo(info);
	}
}
