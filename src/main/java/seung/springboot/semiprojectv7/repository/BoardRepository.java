package seung.springboot.semiprojectv7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seung.springboot.semiprojectv7.model.Board;
import seung.springboot.semiprojectv7.model.Zipcode;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {

}
