package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.VisitVO;

public class VisitDAO {

	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	//방명록 목록 조회
	public List<VisitVO> selectList(){
		List<VisitVO> list = null;
		
		list = sqlSession.selectList("visit.visit_list");
		
		return list;
	}
	
	//방명록 쓰기
	public int insert(VisitVO vo) {
		int res = 0;
		
		res = sqlSession.insert("visit.visit_insert",vo);
		
		return res;
	}
	
	//글 삭제 메서드
	public int delete(int idx) {
		int res = 0;
		res = sqlSession.delete("visit.visit_delete",idx);
		
		return res;
	}
	
	
	//글 검색
	public VisitVO selectOne(int idx) {
		VisitVO vo = null;
		
		vo = sqlSession.selectOne("visit.visit_one", idx);
		
		return vo;
	}
	
	//글 수정
		public int update(VisitVO vo) {
			int res = 0;
			res = sqlSession.update("visit.visit_update",vo);
			
			return res;
		}
}















