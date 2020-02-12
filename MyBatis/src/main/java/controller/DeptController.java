package controller;//14일차 -4

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.DeptDAO;
import vo.DeptVO;

@Controller
public class DeptController {

	private DeptDAO dept_dao;
	
	//경로 설정(14일차 -6)
	public static final String VIEW_PATH = "/WEB-INF/views/dept/";
	
	public DeptController() {
		
	}
	
	public DeptController(DeptDAO dept_dao) {
		System.out.println("DeptController 실행");
		this.dept_dao = dept_dao;
	}
	
	@RequestMapping("/list.do")
	public String list(Model model) {
		//dao에서 목록 요청
		List<DeptVO> list = dept_dao.selectList();
		
		model.addAttribute("list", list);
		
		return VIEW_PATH + "dept_list.jsp";
	}
}
