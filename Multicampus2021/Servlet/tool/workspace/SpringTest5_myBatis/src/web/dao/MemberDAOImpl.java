package web.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import web.vo.MemberVO;

public class MemberDAOImpl implements MemberDAO{
	
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<MemberVO> listMembers() {			
		return sqlSession.selectList("mapper.member.selectAllMemberList");
	}

	@Override
	public void removeMember(String id) {
		sqlSession.delete("mapper.member.deleteMember", id);
		
	}

}
