package service;

import java.util.List;

import dao.BoardDAO;

public class BoardServiceImpl implements BoardService{

	private BoardDAO dao;
	
	public BoardServiceImpl() {
		
	}
	
	public BoardServiceImpl(BoardDAO dao) {
		
		//�ܺο��� ���� dao ������ �������� ���� ������ ����
		this.dao = dao;
	}
	
	@Override
	public List selectList() {
		
		return dao.selectList();
	}

	
	
}
