package kr.co.dksrlgus.score.model;

import java.util.List;

public interface IScoreDAO {

	//점수 등록 기능
	boolean insert(Scores score);
	
	//점수 목록 조회
	List<Scores> list();
	
	//검색 기능
	List<Scores> search(String keyword);
	
	//삭제 기능
	boolean delete(Long id);
	
	
	
	
}
