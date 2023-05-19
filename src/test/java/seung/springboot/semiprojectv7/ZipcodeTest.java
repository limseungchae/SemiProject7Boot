package seung.springboot.semiprojectv7;

import lombok.Data;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import seung.springboot.semiprojectv7.model.Zipcode;
import seung.springboot.semiprojectv7.repository.ZipcodeRepository;

import java.util.List;

@SpringBootTest
public class ZipcodeTest {

    @Autowired
    ZipcodeRepository zipcodeRepository;

    @Test
    @DisplayName("zipcode")
    public void findZipByDong() {
        List<Zipcode> addr = zipcodeRepository.findZipcodeByDong("구로");

        System.out.println(addr);
    }

    @Test
    @DisplayName("zipcode page1")
    public void pageZipcode1() {

        Pageable pageable = PageRequest.of(1, 15);  // 전체 페이지
        Page<Zipcode> page = zipcodeRepository.findAll(pageable);
        List<Zipcode> zips = page.getContent();


        System.out.println(zips);
    }

    @Test
    @DisplayName("zipcode page2")
    public void pageZipcode2() {
        String dong = "%" + "구로" + "%";
        Pageable pageable = PageRequest.of(1, 15);  // 1 페이지
        Page<Zipcode> page = zipcodeRepository.findByDongLike(dong, pageable);
        List<Zipcode> zips = page.getContent();


        System.out.println(zips);
    }
}
