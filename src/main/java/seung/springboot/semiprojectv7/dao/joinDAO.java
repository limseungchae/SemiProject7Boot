package seung.springboot.semiprojectv7.dao;

import seung.springboot.semiprojectv7.model.Member;
import seung.springboot.semiprojectv7.model.Zipcode;

import java.util.List;

public interface joinDAO {

    List<Zipcode> selectZipcode(String dong);

    int newMember(Member m);

    int selectOneUserid(String uid);

    int selectOneMember(Member m);

    int insertMember(Member m);
}
