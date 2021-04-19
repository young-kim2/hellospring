package com.example.hellospring.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
//Non Annotation 방식
//-> handleRequest 메서드에 대응된다
//수동으로 servlet 컨텍스트에 매핑을 등록해야 한다
public class NonAnnotationController implements Controller {
	//Servlet방식으로 request, response만 전달

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav=new ModelAndView();
		mav.addObject("message","<h3>Non Annotation Controller</h3>");
		mav.setViewName("/WEB-INF/views/hello.jsp");
		return mav;
	}

}
