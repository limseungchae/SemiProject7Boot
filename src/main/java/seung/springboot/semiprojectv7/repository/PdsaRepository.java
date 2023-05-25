package seung.springboot.semiprojectv7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import seung.springboot.semiprojectv7.model.PdsAttach;

public interface PdsaRepository extends JpaRepository<PdsAttach, Long> {
}
