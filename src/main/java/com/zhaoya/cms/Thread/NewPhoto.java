package com.zhaoya.cms.Thread;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.github.pagehelper.PageInfo;
import com.zhaoya.cms.domain.Article;
import com.zhaoya.cms.service.ArticleService;

@Controller
public class NewPhoto implements Runnable{
	
	@Autowired
	private ArticleService service;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		PageInfo<Article> selectPhoto = service.selectPhoto(1, 3);
	}

}
