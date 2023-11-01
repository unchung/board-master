package com.example.boards.Service;


import com.example.boards.Mapper.BoardMapper;
import com.example.domain.Board;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {

    private final BoardMapper boardMapper;

    public int boardCount(){
        return boardMapper.boardCount();
    }

    public List<Board> boardList(){
        return boardMapper.getList();
    }

    public Board getBoard(Long boardId) {
               boardMapper.addCount();
        return boardMapper.getBoard(boardId);
    }
}
