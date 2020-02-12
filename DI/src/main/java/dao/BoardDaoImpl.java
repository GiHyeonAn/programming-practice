package dao;

import java.util.ArrayList;
import java.util.List;

public class BoardDaoImpl implements BoardDAO{

	@Override
	public int insert(Object ob) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List selectList() {
		List<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("감");
		list.add("수박");
		list.add("귤");
		
		return list;
	}

	@Override
	public int update(Object ob) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int idx) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
