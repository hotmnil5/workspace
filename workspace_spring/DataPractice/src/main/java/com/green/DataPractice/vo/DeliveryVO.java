package com.green.DataPractice.vo;

public class DeliveryVO {
    private String name;
    private String tel;
    private String add;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "DeliveryVo{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", add='" + add + '\'' +
                '}';
    }
}
