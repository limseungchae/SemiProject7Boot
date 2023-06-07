package seung.springboot.semiprojectv7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import seung.springboot.semiprojectv7.model.Gallery;
import seung.springboot.semiprojectv7.model.Pds;
import seung.springboot.semiprojectv7.service.GalleryService;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/gallery")
public class GalleryController {

    @Autowired
    GalleryService galsrv;

    @GetMapping("/list")
    public String list() {
        return "gallery/list";
    }

    @GetMapping("/write")
    public String write(Model m) {
        m.addAttribute("gallery", new Gallery());

        return "gallery/write";
    }

    @PostMapping("/write")
    public String writeok(Gallery gallery, List<MultipartFile> attachs) {
        String viewPage = "error";

        System.out.println(attachs);



        if (!attachs.isEmpty()) {  // 첨부파일이 존재한다면
            Map<String, Object> ginfo = galsrv.newGallery(gallery);
            galsrv.newGalleryAttach(attachs, ginfo);
            viewPage = "redirect:/gallery/list";
        }

        return viewPage;
    }

}