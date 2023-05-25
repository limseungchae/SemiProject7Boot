package seung.springboot.semiprojectv7.service;

import org.springframework.web.multipart.MultipartFile;
import seung.springboot.semiprojectv7.model.Pds;
import seung.springboot.semiprojectv7.model.PdsAttach;

import java.util.Map;

public interface PdsService {

    Map<String, Object> newPds(Pds pds);

    boolean newPdsAttach(MultipartFile attach, Map<String, Object> pinfo);

    Map<String, Object> readBoard(Integer cpg);

    Pds readPds(int pno);

    PdsAttach readPdsAttatch(int pno);
}
