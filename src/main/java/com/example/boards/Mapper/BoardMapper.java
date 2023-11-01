package com.example.boards.Mapper;

import com.example.domain.Board;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BoardMapper {

    int boardCount();
    int addCount();
    List<Board> getList();
    Board getBoard(Long boardId);

}
