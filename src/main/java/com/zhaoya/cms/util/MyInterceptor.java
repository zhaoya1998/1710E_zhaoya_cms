package com.zhaoya.cms.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * 
 * @ClassName: AdminInterceptor 
 * @Description: 涓汉涓績鎷︽埅鍣�
 * @author: charles
 * @date: 2020骞�1鏈�11鏃� 涓嬪崍4:13:20
 */
public class MyInterceptor extends HandlerInterceptorAdapter {

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//鎷︽埅瑙勫垯锛�
		//1锛氬鏋滅敤鎴峰凡缁忕櫥褰曚笉鎷︽埅
		HttpSession session = request.getSession();
		Object object = session.getAttribute("user");
		if(null!=object)
			return true;//绠＄悊鍛樼櫥褰曚笉鎷︽埅
		
		
		response.sendRedirect("/"); 		
		
		return false;
	}
	
}
