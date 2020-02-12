package com.spring.com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//Component - 읽혀지기는 한다, servlet-context참고
//- Controller
//- Service
//- Repository

//- 상속관계에서 객체를 좀 더 정확하게 영역을 구별할 수 있도록 Controller를 적어준다

//@Conponent
@Controller //없으면 읽혀지지 않는다
public class TestController {

	//실행 경로를 참조할 상수를 지정한다
	public static final String VIEW_PATH = "/WEB-INF/views/test";
	
	public TestController() {
		System.out.println("---TestController 생성자---");
	}
	
	@RequestMapping("/test.do")
	public String test(Model model, HttpServletRequest request) {
		
		String[] msg = new String[] {
			"안녕하소",
			"Hello",
			"Ohayo"
		};
		
		String ip = request.getRemoteAddr();
		//Model은 requeset영역을 잠시 빌려서 바인딩 해놓은 구조이므로 온전한 request객체는 아니다
		//메소드의 매개변수로 request객체를 적어주면 자동으로 받아 온다
		
		request.setAttribute("ip", ip);
		
		model.addAttribute("msg", msg);
		
		return VIEW_PATH + "test.jsp"; // /WEB-INF/views/test/test.jsp
	}
	
	@RequestMapping("/test2.do")
	public ModelAndView test2(HttpServletRequest request) {
		
		//ModelAnView
		// - 데이터와 뷰 정보를 하나의 객체로 포장해서 전달할 수 있는 객체
		
		ModelAndView mv = new ModelAndView();
		
		String[] msg = new String[] {
			"안녕하소",
			"Hello",
			"Ohayo"
		};
		
		String ip = request.getRemoteAddr();
		
		mv.addObject("msg", msg);
		mv.addObject("ip", ip);
		
		//mv에 뷰 정보를 담는다
		mv.setViewName(VIEW_PATH + "test2.jsp");
		
		return mv; // /WEB-INF/views/test/test.jsp
	}
	
	
	
}

