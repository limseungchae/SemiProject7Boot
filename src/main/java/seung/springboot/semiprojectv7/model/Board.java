package seung.springboot.semiprojectv7.model;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Entity
@Table(name = "board")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    @NotBlank(message = "제목은 필수 입력항목입니다!!") // 문자열 길이 0
    private String title;

    @NotBlank(message = "제목은 필수 입력항목입니다!!")
    private String userid;

    @Column(insertable = false, updatable = false)
    private Integer thumbs;

    @Column(insertable = false, updatable = false)
    private Integer views;

    @NotBlank(message = "본문은 필수 입력항목입니다!!")
    private String content;

    @CreatedDate
    @Column(insertable = false, updatable = false)
    private LocalDateTime regdate;

}