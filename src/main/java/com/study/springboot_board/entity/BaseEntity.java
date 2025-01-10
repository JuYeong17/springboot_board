package com.study.springboot_board.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@MappedSuperclass //공통 매핑 정보가 필요할때 사용
@EntityListeners(AuditingEntityListener.class) //엔티티의 생성, 수정과 같은 이벤트를 자동으로 감지하고 처리할 수 있음 생성시간이랑 수정시간 등록하기 위한 사용하는듯
@Getter
public class BaseEntity {
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdTime;

    @UpdateTimestamp
    @Column(updatable = false)
    private LocalDateTime updateTime;
}