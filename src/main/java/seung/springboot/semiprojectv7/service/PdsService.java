package seung.springboot.semiprojectv7.service;

import org.springframework.web.multipart.MultipartFile;
import seung.springboot.semiprojectv7.model.Pds;

public interface PdsService {

    int newPds(Pds pds);

    boolean newPdsAttach(MultipartFile attach, int pno);

}
