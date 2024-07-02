package com.green.ListPractice.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// VO : Value Object
// DTO (BoardDTO) : Data Transfer Object
@Data
public class BoardVO {
    private int boardNum; // 글 번호
    private String title; // 게시글 제목
    private String writer; // 작성자
    private String createDate; // 작성일
    private String content; // 내용

}
