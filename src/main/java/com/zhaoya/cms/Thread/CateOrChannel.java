package com.zhaoya.cms.Thread;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zhaoya.cms.domain.Category;
import com.zhaoya.cms.domain.Channel;
import com.zhaoya.cms.service.ArticleService;


@Controller
public class CateOrChannel implements Runnable{
	@Autowired
	private ArticleService service;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		List<Category> list = service.selectCate();
		List<Channel> list1 = service.selectChannel();
	}
	
	
}
