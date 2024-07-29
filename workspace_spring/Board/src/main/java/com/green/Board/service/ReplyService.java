package com.green.Board.service;

import com.green.Board.vo.ReplyVO;

import java.util.List;

public interface ReplyService {
    //댓글
    List<ReplyVO> selectReply(int boardNum);

    void insertReply(ReplyVO replyVO);

    // 댓글 등록
    void deleteComment(int replyNum);
}
