package com.zhaoya.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhaoya.cms.Thread.CateOrChannel;
import com.zhaoya.cms.Thread.FindHot;
import com.zhaoya.cms.Thread.NewArt;
import com.zhaoya.cms.Thread.NewPhoto;
import com.zhaoya.cms.Thread.Top;
import com.zhaoya.cms.domain.Category;

@Controller
public class ThreadController {

	@RequestMapping("thread")
	public String list() {
		//使用线程查询所有分类和栏目
		CateOrChannel cateOrChannel = new CateOrChannel();
		//使用线程查询热门文章
		FindHot findHot = new FindHot();
		//使用线程查询最新文章
		NewArt newArt = new NewArt();
		//使用线程查询最新图片
		NewPhoto newPhoto = new NewPhoto();
		//使用线程查询顶部的图片
		Top top = new Top();
		
		//使用线程并行技术执行以上线程
		Thread thread1 = new Thread(cateOrChannel);
		Thread thread2 = new Thread(findHot);
		Thread thread3 = new Thread(newArt);
		Thread thread4 = new Thread(newPhoto);
		Thread thread5 = new Thread(top);
		
		//执行线程
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		return "list";
	}
	
}
