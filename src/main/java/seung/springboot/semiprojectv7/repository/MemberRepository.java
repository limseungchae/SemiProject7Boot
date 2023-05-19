package seung.springboot.semiprojectv7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seung.springboot.semiprojectv7.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

    boolean findByUseridEquals(String uid);

    void findByUserid(String abc123);

    // Member findByUseridAndPasswd(String userid, String passwd);

    int countByUseridAndPasswd(String userid, String passwd);
}