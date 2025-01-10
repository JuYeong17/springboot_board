package com.study.springboot_board.repository;

import com.study.springboot_board.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BaseEntity,Long> { //데이터베이스와의 상호작용을 간편하게 처리하기위해 JpaRepository 사용
}
