package seung.springboot.semiprojectv7.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import seung.springboot.semiprojectv7.model.Member;
import seung.springboot.semiprojectv7.repository.MemberRepository;

@Repository("mdao")
public class MemberDAOImpl implements MemberDAO{

    @Autowired
    MemberRepository memberRepository;

    @Override
    public int selectLogin(Member m) {
        int isLogin = -1;

        if (memberRepository.findByUseridAndPasswd(m.getUserid(), m.getPasswd()) != null)
            isLogin = 1;
        return isLogin;
    }
}
