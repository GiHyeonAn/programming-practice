package dao;//14일차-2

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import vo.DeptVO;

public class DeptDAO {
	
	private SqlSession sqlSession;
	//SqlSessionTemplate
	
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	//select메소드(14일차-7)
	public List<DeptVO> selectList() {
		List<DeptVO> list = null;
		
		list = sqlSession.selectList("dept.dept_list");
		
		return list;
	}
	
	

}
