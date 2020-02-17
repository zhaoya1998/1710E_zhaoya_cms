package com.zhaoya.cms.dao;

import java.util.List;

import com.zhaoya.cms.domain.Compent;

public interface CompentMapper {

	/**
	 * 
	 * @Title: insert 
	 * @Description: 澧炲姞涓�鏉¤瘎璁�
	 * @param compent
	 * @return
	 * @return: int
	 */
	int insert(Compent compent);
	
	
	/**
	 * 
	 * @Title: selects 
	 * @Description: 鏍规嵁鏂囩珷鐨処D 鏌ヨ璇勮
	 * @param articleId
	 * @return
	 * @return: List<Compent>
	 */
	List<Compent> selects(Integer articleId);
	
	
	
}
