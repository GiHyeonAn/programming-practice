package service;

import java.util.List;

import dao.BoardDAO;

public class BoardServiceImpl implements BoardService{

	private BoardDAO dao;
	
	public BoardServiceImpl() {
		
	}
	
	public BoardServiceImpl(BoardDAO dao) {
		
		//외부에서 들어온 dao 생성자 인젝션을 통해 주입할 예정
		this.dao = dao;
	}
	
	@Override
	public List selectList() {
		
		return dao.selectList();
	}

	
	
}
