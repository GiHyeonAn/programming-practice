package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.VisitDAO;
import mycommons.MyCommons;
import vo.VisitVO;

@Controller
public class VisitController {

	private VisitDAO visit_dao;
	
	public VisitController(VisitDAO visit_dao) {
		this.visit_dao = visit_dao;
	}
	
	@RequestMapping(value = { "/" , "/list.do"})//�ߺ� ����
	public String list(Model model) {
		VisitVO vo = new VisitVO();
		
		List<VisitVO> list = visit_dao.selectList();
		
		model.addAttribute("list", list);
		
		return MyCommons.Visit.VIEW_PATH + "visit_list.jsp";
	}
	
	@RequestMapping("/insert_form.do")
	public String insert_form() {
		return MyCommons.Visit.VIEW_PATH + "visit_insert_form.jsp";
	}
	
	@RequestMapping("/insert.do")
	public String insert(VisitVO vo,HttpServletRequest request) {
		
		String ip = request.getRemoteAddr();
		
		//Content �����߿� \n
		String content = vo.getContent().replaceAll("\n", "<br>");
		
		vo.setContent(content);
		vo.setIp(ip);
		
		int res = visit_dao.insert(vo);
		
		return "redirect:list.do";
		
	}
	
	@RequestMapping("/delete.do")
	@ResponseBody //return ���� view�� �ν��������� �ٷ� Ŭ���̾�Ʈ�� �����Ѵ� - Ajax�� ���� �۾�
	public String delete(int idx) {
		int res = visit_dao.delete(idx);
		String result = "no";//���� ���� �� 
		if(res != 0) {
			result = "yes";
			
		}
		
		return result;
	}
	
	@RequestMapping("/modify_form.do")
	public String modify_form(Model model, int idx) {
		//�Ķ���ͷ� �Ѿ�� idx�� �ش��ϴ� ��ü�� �Ѱ� ���;� �Ѵ�
		VisitVO vo = visit_dao.selectOne(idx);
		
		if(vo != null) {
			model.addAttribute("vo", vo);
		}
		
		return MyCommons.Visit.VIEW_PATH + "visit_modify_form.jsp";
	}
	
	@RequestMapping("/modify.do")
	@ResponseBody
	public String modify(VisitVO vo,HttpServletRequest request) {
		
		String ip = request.getRemoteAddr();
		
		String content = vo.getContent().replaceAll("\n", "<br>");
		
		vo.setContent(content);
		vo.setIp(ip);
		
		int res = visit_dao.update(vo);
		
		String result = "no";
		
		if(res != 0) {
			result = "yes";
		}
		
		return result;
	}
	
}




































