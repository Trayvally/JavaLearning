package Work3;

public class Student {
    private Integer num;
    private String name;
    private String password;
    private Integer score;

    public Student() {
    }

    public Student(Integer num, String name, String password, Integer score) {
        this.num = num;
        this.name = name;
        this.password = password;
        this.score = score;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", score=" + score +
                '}';
    }

    public void addScore(Integer score) {
        this.score += score;
    }
}
