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
	
	@RequestMapping(value = { "/" , "/list.do"})//중복 맵핑
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
		
		//Content 내용중에 \n
		String content = vo.getContent().replaceAll("\n", "<br>");
		
		vo.setContent(content);
		vo.setIp(ip);
		
		int res = visit_dao.insert(vo);
		
		return "redirect:list.do";
		
	}
	
	@RequestMapping("/delete.do")
	@ResponseBody //return 값을 view로 인식하지말고 바로 클라이언트로 응답한다 - Ajax를 위한 작업
	public String delete(int idx) {
		int res = visit_dao.delete(idx);
		String result = "no";//삭제 실패 시 
		if(res != 0) {
			result = "yes";
			
		}
		
		return result;
	}
	
	@RequestMapping("/modify_form.do")
	public String modify_form(Model model, int idx) {
		//파라미터로 넘어온 idx에 해당하는 객체를 한개 얻어와야 한다
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




































