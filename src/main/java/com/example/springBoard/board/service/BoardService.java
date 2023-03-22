package com.example.springBoard.board.service;

import com.example.springBoard.board.dto.BoardDTO;
import com.example.springBoard.board.entity.BoardEntity;
import com.example.springBoard.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// DTO -> Entity (Entity class)
// Entity -> DTO (DTO class)

// Entity 클래스는 최대한 노출안되게 코딩 (service에서 해결)

@Service
@RequiredArgsConstructor
public class BoardService {

    private  final BoardRepository boardRepository;
    public void save(BoardDTO boardDTO) {
        BoardEntity boardEntity = BoardEntity.toSaveEntity(boardDTO);
        boardRepository.save(boardEntity);
    }
}
