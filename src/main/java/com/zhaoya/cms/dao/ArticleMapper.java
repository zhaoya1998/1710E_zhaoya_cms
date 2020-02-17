package com.zhaoya.cms.dao;

import java.util.List;

import com.zhaoya.cms.domain.Article;

public interface ArticleMapper {
	/**
	 * 
	 * @Title: selects 
	 * @Description: 鏂囩珷鐨勫垪琛�
	 * @param article
	 * @return
	 * @return: List<Article>
	 */
	List<Article> selects(Article article);
	
	/**
	 * 
	 * @Title: update 
	 * @Description: 鏇存柊鏂囩珷
	 * @param article
	 * @return
	 * @return: int
	 */
	int update(Article article);
	/**
	 * 
	 * @Title: select 
	 * @Description: 鏍规嵁id 鏌ヨ鏂囩珷鍐呭
	 * @param id
	 * @return
	 * @return: Article
	 */
	Article select(Integer id);
	/**
	 * 
	 * @Title: insert 
	 * @Description: 澧炲姞鏂囩珷
	 * @param article
	 * @return
	 * @return: int
	 */
	int insert(Article article);

}
