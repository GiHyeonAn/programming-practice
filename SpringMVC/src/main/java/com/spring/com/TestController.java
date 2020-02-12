package com.spring.com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Component - ��������� �Ѵ�, servlet-context����
//- Controller
//- Service
//- Repository

//- ��Ӱ��迡�� ��ü�� �� �� ��Ȯ�ϰ� ������ ������ �� �ֵ��� Controller�� �����ش�

//@Conponent
@Controller //������ �������� �ʴ´�
public class TestController {

	//���� ��θ� ������ ����� �����Ѵ�
	public static final String VIEW_PATH = "/WEB-INF/views/test";
	
	public TestController() {
		System.out.println("---TestController ������---");
	}
	
	@RequestMapping("/test.do")
	public String test(Model model, HttpServletRequest request) {
		
		String[] msg = new String[] {
			"�ȳ��ϼ�",
			"Hello",
			"Ohayo"
		};
		
		String ip = request.getRemoteAddr();
		//Model�� requeset������ ��� ������ ���ε� �س��� �����̹Ƿ� ������ request��ü�� �ƴϴ�
		//�޼ҵ��� �Ű������� request��ü�� �����ָ� �ڵ����� �޾� �´�
		
		request.setAttribute("ip", ip);
		
		model.addAttribute("msg", msg);
		
		return VIEW_PATH + "test.jsp"; // /WEB-INF/views/test/test.jsp
	}
	
	@RequestMapping("/test2.do")
	public ModelAndView test2(HttpServletRequest request) {
		
		//ModelAnView
		// - �����Ϳ� �� ������ �ϳ��� ��ü�� �����ؼ� ������ �� �ִ� ��ü
		
		ModelAndView mv = new ModelAndView();
		
		String[] msg = new String[] {
			"�ȳ��ϼ�",
			"Hello",
			"Ohayo"
		};
		
		String ip = request.getRemoteAddr();
		
		mv.addObject("msg", msg);
		mv.addObject("ip", ip);
		
		//mv�� �� ������ ��´�
		mv.setViewName(VIEW_PATH + "test2.jsp");
		
		return mv; // /WEB-INF/views/test/test.jsp
	}
	
	
	
}

