package seung.springboot.semiprojectv7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seung.springboot.semiprojectv7.model.Member;

public interface MemmberRepository extends JpaRepository<Member, Long> {


}
