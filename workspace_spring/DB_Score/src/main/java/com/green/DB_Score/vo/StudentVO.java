package com.green.DB_Score.vo;

import lombok.Data;
import lombok.Getter;

@Data
public class StudentVO {
    private int stuNum;
    private String stuName;
    private int korScore;
    private int engScore;
    private String intro;

}
