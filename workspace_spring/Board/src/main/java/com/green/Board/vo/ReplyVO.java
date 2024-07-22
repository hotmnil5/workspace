package com.green.Board.vo;

import lombok.Data;

import java.util.Date;
@Data
public class ReplyVO {
    private int replyNum;
    private String replyContent;
    private Date replyDate;
    private String memId;
    private int boardNum;
}
