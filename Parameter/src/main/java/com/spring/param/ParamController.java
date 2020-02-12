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
		//name, age, tel�� �Ķ���ͷ� �ڵ����� �Ѿ� �´�
		//���� ���� ó���ϸ� �ȴ�
		
		PersonVO vo = new PersonVO();
		
		vo.setName(name);
		vo.setAge(age);
		vo.setTel(tel);
		
		model.addAttribute("vo", vo);
		
		return VIEW_PATH + "insert_result.jsp";
	}
	
	@RequestMapping("/insert2.do")
	public String insert2(Model model, PersonVO vo) {
		//�Ķ���ͷ� �Ѿ�� ����  vo�ȿ� �Ӽ��� ��ġ�ϴ� ������ �ڵ����� �߰��� �ش�
		
		model.addAttribute("vo", vo);
		
		return VIEW_PATH + "insert_result.jsp";
	}
}
