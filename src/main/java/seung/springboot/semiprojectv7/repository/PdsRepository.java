package seung.springboot.semiprojectv7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import seung.springboot.semiprojectv7.model.Pds;

import javax.transaction.Transactional;

public interface PdsRepository extends JpaRepository<Pds, Long> {

    @Modifying
    @Transactional
    @Query("update Pds set views = views + 1 where pno = :pno")
    void countViewById(@Param("pno") long pno);


}
