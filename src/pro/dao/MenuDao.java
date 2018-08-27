package pro.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pro.vo.MenuAttachVo;
import pro.vo.MenuVo;

@Repository
public class MenuDao {
	@Autowired
	SqlSessionTemplate template;
	
	public boolean addMenu(MenuVo vo) {
		int r = template.insert("owner.addMenu",vo);
		System.out.println(r);
		return r==1;
	}
	public int getSequence() {
		return template.selectOne("owner.getSeq");
	}

	public List<MenuVo> getMenuList(int no) {
		return template.selectList("owner.getMenuList",no);
	}

	public MenuVo getMenu(int no) {
		return template.selectOne("owner.getMenu", no);
	}
	
	public int addMenuAttach(MenuAttachVo vo) {
		return template.insert("owner.addAttach",vo);
	}
	
}