package kr.co.dksrlgus.board.model;

import java.util.List;

public interface IBoardDAO {
	
	//게시글 쓰기(C)
	boolean insert(Board article);
	
	//게시글 목록 조회(R)
	List<Board> selectAll();
	
	//게시글 상세 조회(R)
	Board selectOne(Long boardId);
	
	//게시글 수정(U)
	boolean update(Board article);
		
	//게시글 삭제(D)
	boolean delete(Long boardId);

}
