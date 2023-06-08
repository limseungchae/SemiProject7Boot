package seung.springboot.semiprojectv7.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import seung.springboot.semiprojectv7.model.GalAttach;
import seung.springboot.semiprojectv7.model.Gallery;
import seung.springboot.semiprojectv7.repository.GalleryRepository;
import seung.springboot.semiprojectv7.repository.GalleryaRepository;

import java.util.HashMap;
import java.util.Map;

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

    @Override
    public Map<String, Object> selectGallery(Integer cpg) {

        Pageable paging = PageRequest.of(cpg, 25, Sort.Direction.DESC, "gno");

        Map<String, Object> gals = new HashMap<>();
        // Gallery와 GalAttach를 조인해서 리스트로 가져옴
        gals.put("gallist", galleryaRepository.findAllBy(paging).getContent());
        gals.put("cntpg", galleryaRepository.findAllBy(paging).getTotalPages());

        System.out.println(gals.get("gallist"));
        System.out.println(gals.get("cntpg"));

        return gals;
    }
}
