package seung.springboot.semiprojectv7.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import seung.springboot.semiprojectv7.model.Member;
import seung.springboot.semiprojectv7.model.Zipcode;

import java.util.List;

@Repository("joindao")
public class joinDAOImpl implements joinDAO {

    @Autowired private SqlSession sqlSession;


    @Override
    public List<Zipcode> selectZipcode(String dong) {
        return sqlSession.selectList("join.findZipcode", dong);
    }

    @Override
    public int insertMember(Member m) {
        return sqlSession.insert("join.insertMember", m);
    }

    @Override
    public int newMember(Member m) {
        return 0;
    }

    @Override
    public int selectOneUserid(String uid) {
        return sqlSession.selectOne("join.selectOneUid", uid);
    }

    @Override
    public int selectOneMember(Member m) {
        return 0;
    }
}
