package collection.list;


public class Student {
    private String stuName;
    private int kScore;
    private int eScore;
    private int mScore;
    private int sumScore;

    public Student(String stuName, Integer kScore, Integer eScore, Integer mScore) {
        this.stuName = stuName;
        this.kScore = kScore;
        this.eScore = eScore;
        this.mScore = mScore;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getkScore() {
        return kScore;
    }

    public void setkScore(Integer kScore) {
        this.kScore = kScore;
    }

    public Integer geteScore() {
        return eScore;
    }

    public void seteScore(Integer eScore) {
        this.eScore = eScore;
    }

    public Integer getmScore() {
        return mScore;
    }

    public void setmScore(Integer mScore) {
        this.mScore = mScore;
    }

    public Integer getSumScore() {
        return kScore+eScore+mScore;
    }

    public void setSumScore(Integer sumScore) {
        this.sumScore = sumScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuName='" + stuName + '\'' +
                ", kScore=" + kScore +
                ", eScore=" + eScore +
                ", mScore=" + mScore +
                ", sumScore=" + sumScore +
                '}';
    }
}
