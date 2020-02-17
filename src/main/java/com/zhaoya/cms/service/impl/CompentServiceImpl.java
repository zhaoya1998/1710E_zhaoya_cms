package com.zhaoya.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaoya.cms.dao.CompentMapper;
import com.zhaoya.cms.domain.Compent;
import com.zhaoya.cms.service.CompentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CompentServiceImpl implements CompentService {

	@Autowired
	private CompentMapper compentMapper;

	public int insert(Compent compent) {
		return compentMapper.insert(compent);
	}

	public PageInfo<Compent> selects(Integer articleId, Integer page, Integer pageSize) {

		PageHelper.startPage(page, pageSize);
		List<Compent> list = compentMapper.selects(articleId);

		return new PageInfo<Compent>(list);
	}

}
