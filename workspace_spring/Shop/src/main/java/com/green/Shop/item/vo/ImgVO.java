package com.green.Shop.item.vo;

import lombok.Data;

import java.util.List;

@Data
public class ImgVO {
    private int imgCode;
    private String originFileName;
    private String attachedFileName;
    private String isMain;
    private int itemCode;
}
