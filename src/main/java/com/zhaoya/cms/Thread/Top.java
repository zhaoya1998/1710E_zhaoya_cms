package com.zhaoya.cms.Thread;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zhaoya.cms.domain.Slide;
import com.zhaoya.cms.service.ArticleService;



@Controller
public class Top implements Runnable{
	
	@Autowired
	private	ArticleService service;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		List<Slide> list = service.findSlide();
	}

}
