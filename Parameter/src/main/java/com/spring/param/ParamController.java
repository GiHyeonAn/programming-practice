package com.spring.param;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import vo.PersonVO;

@Controller
public class ParamController {

	public static final String VIEW_PATH = "/WEB-INF/views/person/";
	
	@RequestMapping("/insert_form.do")
	public String insert_form() {
		
		
		return VIEW_PATH + "insert_form.jsp";
	}
	
	@RequestMapping("/insert1.do")
	public String insert1(Model model, @RequestParam("name") String name, int age, String tel) {
		//name, age, tel이 파라미터로 자동으로 넘어 온다
		//받은 값을 처리하면 된다
		
		PersonVO vo = new PersonVO();
		
		vo.setName(name);
		vo.setAge(age);
		vo.setTel(tel);
		
		model.addAttribute("vo", vo);
		
		return VIEW_PATH + "insert_result.jsp";
	}
	
	@RequestMapping("/insert2.do")
	public String insert2(Model model, PersonVO vo) {
		//파라미터로 넘어온 값을  vo안에 속성이 일치하는 변수에 자동으로 추가해 준다
		
		model.addAttribute("vo", vo);
		
		return VIEW_PATH + "insert_result.jsp";
	}
}
