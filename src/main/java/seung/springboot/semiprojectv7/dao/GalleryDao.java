package seung.springboot.semiprojectv7.dao;

import seung.springboot.semiprojectv7.model.GalAttach;
import seung.springboot.semiprojectv7.model.Gallery;

import java.util.Map;

public interface GalleryDao {
    int insertGal(Gallery gallery);

    int insertGalAttach(GalAttach ga);

    Map<String, Object> selectGallery(Integer cpg);
}
