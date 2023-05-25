package seung.springboot.semiprojectv7.service;

import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.web.multipart.MultipartFile;
import seung.springboot.semiprojectv7.model.Pds;
import seung.springboot.semiprojectv7.model.PdsAttach;

import java.util.Map;

public interface PdsService {

    Map<String, Object> newPds(Pds pds);

    boolean newPdsAttach(MultipartFile attach, Map<String, Object> pinfo);

    Map<String, Object> readPds(Integer cpg);

    Pds readOnePds(int pno);

    PdsAttach readOnePdsAttatch(int pno);

    HttpHeaders getHeader(String fname, String uuid);

    UrlResource getResoutce(String fname, String uuid);
}
