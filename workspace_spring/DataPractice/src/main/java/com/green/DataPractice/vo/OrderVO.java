package com.green.DataPractice.vo;

import javax.naming.StringRefAddr;
import java.util.Arrays;

public class OrderVO {
    private String ck;
    private int number;
    private String[] option;
    private String pls;

    public String getCk() {
        return ck;
    }

    public void setCk(String ck) {
        this.ck = ck;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String[] getOption() {
        return option;
    }

    public void setOption(String[] option) {
        this.option = option;
    }

    public String getPls() {
        return pls;
    }

    public void setPls(String pls) {
        this.pls = pls;
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "ck='" + ck + '\'' +
                ", number=" + number +
                ", option=" + Arrays.toString(option) +
                ", pls='" + pls + '\'' +
                '}';
    }


}
