package com.study.springboot_board.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

//DB 테이블 역할을 하는 클래스 이 엔티티는 서비스 랑 레파지토리에서만 사용하자
@Entity
@Getter
@Setter
@Table(name ="board_table")
public class BoardEntity extends BaseEntity{
    @Id //pk 컬러미 지정 . 필수
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto_increment
    private Long id;

    @Column(length = 20, nullable = false) //크기는 20, not null
    private String boardWriter;

    @Column //크기 255, Null 가능
    private String boardPass;

    @Column
    private String boardTitle;

    @Column(length = 500)
    private String boardContents;

    @Column
    private int boardHits;
}
