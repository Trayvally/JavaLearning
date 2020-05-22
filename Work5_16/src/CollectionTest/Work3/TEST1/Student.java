package CollectionTest.Work3.TEST1;


import java.util.HashSet;
import java.util.Set;

public class Student {
    private Integer num;
    private String name;
    private HashSet<Integer> course;



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

    public Set getCourse() {
        return course;
    }

    public void setCourse(HashSet course) {
        this.course = course;
    }

    public void deleteCourseByName(HashSet course){
        this.course.remove(name);
    }
    public void deleteCourseByNum(HashSet course){
        this.course.remove(name);
    }

    public Student() {
    }



    public Student(Integer num, String name, HashSet course) {
        this.num = num;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
