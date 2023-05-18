package seung.springboot.semiprojectv7.dao;

import org.springframework.stereotype.Repository;
import seung.springboot.semiprojectv7.model.Member;
import seung.springboot.semiprojectv7.model.Zipcode;

import java.util.List;

@Repository("joindao")
public class joinDAOImpl implements joinDAO {

    @Override
    public List<Zipcode> selectZipcode(String dong) {
        return null;
    }

    @Override
    public int newMember(Member m) {
        return 0;
    }

    @Override
    public int selectOneUserid(String uid) {
        return 0;
    }

    @Override
    public int selectOneMember(Member m) {
        return 0;
    }

    @Override
    public int insertMember(Member m) {
        return 0;
    }
}
