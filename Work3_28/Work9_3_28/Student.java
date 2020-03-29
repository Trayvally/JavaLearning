package Work.Work3_28.Work9_3_28;

public class Student {
    private String name;
    private int number;
    private int classNum;
    private int score;

    public Student() {
    }

    public Student(String name, int number, int classNum, int score) {
        this.name = name;
        this.number = number;
        this.classNum = classNum;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        if (classNum>0&&classNum<12)
        this.classNum = classNum;
        else {
            System.out.println("班级号错误，不存在此班级");
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        if (score<0||score>100){
            System.out.println("分数错误");
        }else {
            this.score = score;
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", classNum=" + classNum +
                ", score=" + score +
                '}';
    }
}
