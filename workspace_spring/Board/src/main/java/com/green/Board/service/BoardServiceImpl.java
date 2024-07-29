package com.green.Board.service;

import com.green.Board.vo.BoardVO;
import com.green.Board.vo.ReplyVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("boardService")
public class BoardServiceImpl implements BoardService{
    @Autowired
    private SqlSessionTemplate sqlSession;

    //게시글 목록 조회
    @Override
    public List<BoardVO> getBoardList() {
        return sqlSession.selectList("boardMapper.getBoardList");
    }

    @Override
    public void insertBoard(BoardVO boardVO) {
        sqlSession.insert("boardMapper.insertBoard", boardVO);
    }

    @Override
    public BoardVO selectBoard(int boardNum) {
        return sqlSession.selectOne("boardMapper.selectBoard", boardNum);
    }

    // 댓글 + 게시글 삭제
    @Override
    public void deletePost(int boardNum) {
        // 댓글 삭제
        sqlSession.delete("replyMapper.deleteReply", boardNum);
        // 게시글 삭제
        sqlSession.delete("boardMapper.deletePost", boardNum);
    }

}
