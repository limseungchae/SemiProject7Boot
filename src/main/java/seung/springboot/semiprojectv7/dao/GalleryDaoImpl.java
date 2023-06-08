package seung.springboot.semiprojectv7.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import seung.springboot.semiprojectv7.model.GalAttach;
import seung.springboot.semiprojectv7.model.Gallery;
import seung.springboot.semiprojectv7.repository.GalleryRepository;
import seung.springboot.semiprojectv7.repository.GalleryaRepository;

@Repository("galdao")
public class GalleryDaoImpl implements GalleryDao{

    // 생성자를 이용한 스프링 빈 주입
    private final GalleryRepository galleryRepository;
    private final GalleryaRepository galleryaRepository;

    @Autowired
    public GalleryDaoImpl(GalleryRepository galleryRepository, GalleryaRepository galleryaRepository) {
        this.galleryaRepository = galleryaRepository;
        this.galleryRepository = galleryRepository;
    }

    @Override
    public int insertGal(Gallery gallery) {
        return Math.toIntExact(galleryRepository.save(gallery).getGno());
    }

    @Override
    public int insertGalAttach(GalAttach ga) {
        return galleryaRepository.save(ga).getGno();
    }
}
