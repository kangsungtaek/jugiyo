package pro.dao;

import java.util.List;

import org.bson.Document;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import pro.vo.LogVo;
import pro.vo.MemberVo;

@Repository
public class MemberDao {

	@Autowired
	MongoTemplate mongoTemplate;
	@Autowired
	SqlSessionTemplate template;
	
	//로그인에 필요한 함수, 아이디를 통해서 vo를 불러오는 작업
	public MemberVo findById(String id) {
		return template.selectOne("member.findById", id);
		//member가 mapper이름 findById는 sql문 이름
	}
	
	//회원가입용 함수
	public int addMember(MemberVo vo) {
		return template.insert("member.addMember", vo);
	}
	
	//아이디 중복체크용 함수
	public List<String> findAll() {
		return template.selectList("member.findAll");  // mapper이름==member이고, .findAll은 sql문 이름을 말함.
	}
	//주문내역불러오기
	public List<LogVo> readAllById(String id) {
		Query query = new BasicQuery(new Document().append("_id", id));
		return mongoTemplate.find(query, LogVo.class, "log");
	}

}