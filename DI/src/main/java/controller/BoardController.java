package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.BoardService;

@Controller
public class BoardController {

	private BoardService service;
	
	public BoardController() {
		System.out.println("--BoardController 생성자--");
	}
	
	public void setService(BoardService service) {
		this.service = service;
	}
	
	//사용자가 Board/list.do를 요청 하면 해당 메소드가 실행될 수 있도록 하려면
	//@requestMapping을 통해 지정하면 된다
	
	@RequestMapping("/Board/list.do")
	public String list(Model model) {
		//Model
		// - Servlet과 Controller의 중간 매개체 역할을 하는 인터페이서
		// - request객체와 바인딩 처리가 되어 서로간의 호환이 가능해 진다(바인딩 = 연결)
		
		List<String> list = service.selectList();
		
		
		//request.setAttribute
		model.addAttribute("list", list);
		
		return "Board_list";
	}
	
}
