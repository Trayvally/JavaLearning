package CollectionTest.Work3.TEST2;

public class Student implements Comparable<Student> {
    private Integer num;
    private Integer score;

    public Student(Integer num, Integer score) {
        this.num = num;
        this.score = score;
    }

    public Student() {
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
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
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.score < o.score) {
            return 1;
        } else if (this.score > o.score) {
            return -1;
        } else {
            if(this.num<o.num) {
                return 1;
            }else {
                return -1;
            }

        }
    }
}
