package seung.springboot.semiprojectv7.dao;

import seung.springboot.semiprojectv7.model.Pds;
import seung.springboot.semiprojectv7.model.PdsAttach;

public interface PdsDAO {

    int insertPda(Pds pds);

    int insertPdsAttach(PdsAttach pa);
}
