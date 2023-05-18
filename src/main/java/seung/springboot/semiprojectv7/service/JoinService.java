package seung.springboot.semiprojectv7.service;

import seung.springboot.semiprojectv7.model.Member;

public interface JoinService {

    String findZipcode(String dong);

    boolean newMember(Member m);

    boolean checkUserid(String uid);

    boolean loginMember(Member m);
}
