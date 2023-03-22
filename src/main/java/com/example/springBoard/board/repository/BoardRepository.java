package com.example.springBoard.board.repository;

import com.example.springBoard.board.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository<Entity 클래스 이름, Entity 클래스의 pk의 타입>
public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
