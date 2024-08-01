package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import com.green.Board.vo.ReplyVO;
import com.green.Board.vo.SearchVO;

import java.util.List;

public interface BoardService {

    //게시글 목록 조회
    List<BoardVO> getBoardList(SearchVO searchVO);

    //게시글 등록
    void insertBoard(BoardVO boardVO);

    //게시글 상세정보
    BoardVO selectBoard(int boardNum);

    //게시글 삭제
    void deletePost(int boardNum);

    //게시글 수정
    void updateBoard(BoardVO boardVO);
}
