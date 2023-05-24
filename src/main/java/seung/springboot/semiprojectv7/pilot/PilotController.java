package seung.springboot.semiprojectv7.pilot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/pilot")
public class PilotController {

    @GetMapping("/write") // 입력폼
    public String write() {
        return "pilot/write";
    }

    @PostMapping("/write") // 전송된 데이터 처리
    public String writeok(String title, String content,
                          MultipartFile attach, Model m) throws IOException {

        // 일반 폼 요소 처리
        m.addAttribute("title", title);
        m.addAttribute("content", content);

        // 멀티파트 폼 요소 처리
        if (attach.isEmpty())
            m.addAttribute("attach", "첨부파일이 없어요!!");
        else {
            String fname = attach.getOriginalFilename();

            // 업로드한 파일이름 알아내기
            m.addAttribute("filename", attach.getOriginalFilename());
            // 업로드한 파일종류 알아내기
            m.addAttribute("filetype", attach.getContentType());
            // 업로드한 파일크기 알아내기
            m.addAttribute("filesize", attach.getSize()/1024);

            // 겹치치 않는 파일명 작성을 위해 유니크한 값 생성1
            // 파일이름 + uid + 확장자
            // abc.jpg -> abc15bdb1fa-5cbf-4a16-97b0-89860b86973a.jpg
            String uuid = UUID.randomUUID()
                    .toString().replace("-", ""); // uuid에서 '-' 제거
            m.addAttribute("uuid", uuid);

            // 파일이름과 확장자 분리하기
            String fileName = fname.split("[.]")[0];
            String fileExt = fname.split("[.]")[1];

            // 겹치치 않는 파일명 작성을 위해 유니크한 값 생성2
            String fmt = "yyyyMMddHHss";
            SimpleDateFormat sdf = new SimpleDateFormat(fmt);
            uuid = sdf.format(new Date());
            m.addAttribute("uuid", uuid);

            // 업로드한 파일 저장하기
            attach.transferTo(new File("C:/Java/bootUpload/"
                    + fileName + uuid + "." + fileExt));
        }

        return "pilot/list";
    }

    @GetMapping("/list")
    public String list() {
        return "pilot/list";
    }
}
