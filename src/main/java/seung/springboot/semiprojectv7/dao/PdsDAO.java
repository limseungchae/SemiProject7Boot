package seung.springboot.semiprojectv7.dao;

import seung.springboot.semiprojectv7.model.Pds;
import seung.springboot.semiprojectv7.model.PdsAttach;

import java.util.Map;

public interface PdsDAO {

    int insertPda(Pds pds);

    int insertPdsAttach(PdsAttach pa);

    Map<String, Object> selectPds(int cpg);

    Pds selectOnePds(int pno);

    PdsAttach selectOnePdsAttach(int pno);
}
