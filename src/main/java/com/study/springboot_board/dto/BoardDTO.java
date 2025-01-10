package com.study.springboot_board.dto;

import lombok.*;

import java.time.LocalDateTime;

//DTO(Data Transfer Object),VO,Bean
@Getter
@Setter //자동으로 만들어줌
@ToString
@NoArgsConstructor //기본생성자
@AllArgsConstructor //모든 필드를 매개변수로 하는 생성
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits; //조회수
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdateTime;
//getter, setter로 필드값을 가져오고 쓴다.
}
