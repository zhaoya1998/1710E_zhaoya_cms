package com.zhaoya.cms.service;

import com.zhaoya.cms.domain.Article;
import com.zhaoya.cms.domain.Category;
import com.zhaoya.cms.domain.Channel;
import com.zhaoya.cms.domain.Slide;

import java.util.List;

import com.github.pagehelper.PageInfo;

public interface ArticleService {


	/**
	 * 
	 * @Title: selects 
	 * @Description: 文章的列表
	 * @param article
	 * @return
	 * @return: List<Article>
	 */
	PageInfo<Article> selects(Article article,Integer page,Integer pageSize);
	
	/**
	 * 
	 * @Title: update 
	 * @Description: 更新文章
	 * @param article
	 * @return
	 * @return: int
	 */
	boolean update(Article article);
	
	
	/**
	 * 
	 * @Title: select 
	 * @Description: 根据id 查询文章内容
	 * @param id
	 * @return
	 * @return: Article
	 */
	Article select(Integer id);
	
	/**
	 * 
	 * @Title: insert 
	 * @Description: 增加文章
	 * @param article
	 * @return
	 * @return: int
	 */
	boolean insert(Article article);

	List<Category> selectCate();

	List<Channel> selectChannel();

	List<Article> selectHot();

	PageInfo<Article> selectPhoto(int i, int j);

	List<Slide> findSlide();
}
