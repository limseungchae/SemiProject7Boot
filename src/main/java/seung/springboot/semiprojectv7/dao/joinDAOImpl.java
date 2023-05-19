package seung.springboot.semiprojectv7.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import seung.springboot.semiprojectv7.model.Member;
import seung.springboot.semiprojectv7.model.Zipcode;
import seung.springboot.semiprojectv7.repository.MemberRepository;
import seung.springboot.semiprojectv7.repository.ZipcodeRepository;

import java.util.List;

@Repository("joindao")
public class joinDAOImpl implements joinDAO {

    @Autowired
    ZipcodeRepository zipcodeRepository;

    @Autowired
    MemberRepository memberRepository;

    @Override
    public List<Zipcode> selectZipcode(String dong) {
        return zipcodeRepository.findZipcodeByDong(dong);
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
        int isSaved = -1;

        m = memberRepository.save(m);
        if (m != null) isSaved = Math.toIntExact(m.getMbno());

        return isSaved;
    }
}
