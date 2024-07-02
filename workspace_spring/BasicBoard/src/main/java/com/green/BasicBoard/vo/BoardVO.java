package com.green.BasicBoard.vo;

import lombok.Data;
import lombok.Getter;

@Data
public class BoardVO {
    private int boardNum;
    private String title;
    private String writer;
    private String content;
    private String createDate;
    private int readCnt;
}
