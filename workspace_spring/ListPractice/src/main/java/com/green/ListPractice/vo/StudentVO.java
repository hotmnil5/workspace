package com.green.ListPractice.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.sql.Struct;

@Data
public class StudentVO {
    private int num;
    private String name;
    private int korScore;
    private int engScore;
    private int sumScore;
    private String intr;
}
