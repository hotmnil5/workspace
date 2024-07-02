package com.green.DataPractice.vo;

import java.util.Arrays;

public class SurveyVO {
    private String intro;
    private String gen;

    // 여러 개의 데이터를 담으려면 배열 또는 List 사용
    private String[] hobby;
    //private List<String> hobby;

    private String path;

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String[] getHobby() {
        return hobby;
    }

    public void setHobby(String[] hobby) {
        this.hobby = hobby;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "SurveyVO{" +
                "intro='" + intro + '\'' +
                ", gen='" + gen + '\'' +
                ", hobby=" + Arrays.toString(hobby) +
                ", path='" + path + '\'' +
                '}';
    }
}
