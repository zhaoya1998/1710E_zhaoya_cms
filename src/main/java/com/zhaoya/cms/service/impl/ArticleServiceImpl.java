package com.zhaoya.cms.service.impl;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.zhaoya.cms.dao.ArticleMapper;
import com.zhaoya.cms.domain.Article;
import com.zhaoya.cms.domain.Category;
import com.zhaoya.cms.domain.Channel;
import com.zhaoya.cms.domain.Slide;
import com.zhaoya.cms.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleMapper articleMapper;

	@Autowired
	private RedisTemplate redisTemplate;

	public PageInfo<Article> selects(Article article, Integer page, Integer pageSize) {
		List<Article> list = null;
		/** 只缓存第一页 **/
		if (page != 1) {
			PageHelper.startPage(page, pageSize);
			list = articleMapper.selects(article);
			return new PageInfo<Article>(list);
		}
		/** 设置缓存的Key **/
		String cacheKey = "hotlist:" + page;
		/** redis是否已缓存了数据 **/
		list = (List<Article>) redisTemplate.opsForValue().get(cacheKey);
		/** 如果已换成数据，则读redis数据直接返回 **/
		if (list != null && list.size() != 0) {
			System.out.println("从缓存获取热点数据成功");
			return new PageInfo<Article>(list);
		}
		/** 如果未换成数据，则查询数据库，并换成到redis，设置缓存时间 **/
		PageHelper.startPage(page, pageSize);
		list = articleMapper.selects(article);
		/** 设置缓存 **/
		redisTemplate.opsForValue().set(cacheKey, list);
		redisTemplate.expire(cacheKey, 60, TimeUnit.SECONDS);
		System.out.println("设置缓存数据成功");
		return new PageInfo<Article>(list);
	}

	public boolean update(Article article) {
		// TODO Auto-generated method stub
		return articleMapper.update(article) > 0;
	}

	public Article select(Integer id) {
		// TODO Auto-generated method stub
		return articleMapper.select(id);
	}

	public boolean insert(Article article) {
		// TODO Auto-generated method stub
		return articleMapper.insert(article) > 0;
	}

	@Override
	public List<Category> selectCate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Channel> selectChannel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> selectHot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PageInfo<Article> selectPhoto(int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Slide> findSlide() {
		// TODO Auto-generated method stub
		return null;
	}

}
