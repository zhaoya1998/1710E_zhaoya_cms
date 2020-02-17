package com.zhaoya.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhaoya.cms.dao.SlideMapper;
import com.zhaoya.cms.domain.Slide;
import com.zhaoya.cms.service.SlideService;

@Service
public class SlideServiceImpl implements SlideService {
	@Autowired
	private SlideMapper slideMapper; 

	public List<Slide> selects() {
		// TODO Auto-generated method stub
		return slideMapper.selects();
	}

}
