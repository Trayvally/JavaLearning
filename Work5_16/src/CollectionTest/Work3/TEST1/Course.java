package CollectionTest.Work3.TEST1;

public class Course {
    private Integer num;
    private String courseName;

    public Course(Integer num, String courseName) {
        this.num = num;
        this.courseName = courseName;
    }

    public Course() {
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "num=" + num +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
