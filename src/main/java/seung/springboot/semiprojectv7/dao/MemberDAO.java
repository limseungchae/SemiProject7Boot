package seung.springboot.semiprojectv7.dao;

import seung.springboot.semiprojectv7.model.Member;

public interface MemberDAO {
    int selectLogin(Member m);
}
