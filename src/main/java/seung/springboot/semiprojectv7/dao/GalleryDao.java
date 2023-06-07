package seung.springboot.semiprojectv7.dao;

import seung.springboot.semiprojectv7.model.GalAttach;
import seung.springboot.semiprojectv7.model.Gallery;

public interface GalleryDao {
    int insertGal(Gallery gallery);

    int insertGalAttach(GalAttach ga);
}
