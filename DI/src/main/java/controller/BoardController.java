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
		System.out.println("--BoardController ������--");
	}
	
	public void setService(BoardService service) {
		this.service = service;
	}
	
	//����ڰ� Board/list.do�� ��û �ϸ� �ش� �޼ҵ尡 ����� �� �ֵ��� �Ϸ���
	//@requestMapping�� ���� �����ϸ� �ȴ�
	
	@RequestMapping("/Board/list.do")
	public String list(Model model) {
		//Model
		// - Servlet�� Controller�� �߰� �Ű�ü ������ �ϴ� �������̼�
		// - request��ü�� ���ε� ó���� �Ǿ� ���ΰ��� ȣȯ�� ������ ����(���ε� = ����)
		
		List<String> list = service.selectList();
		
		
		//request.setAttribute
		model.addAttribute("list", list);
		
		return "Board_list";
	}
	
}
