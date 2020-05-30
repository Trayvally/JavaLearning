package Work2.Lecture2;

import java.util.ArrayList;
import java.util.List;

public class Student implements Comparable<Student> {
    String name;
    Integer Chinese;
    Integer Math;
    Integer English;
    Integer sum;
    Integer average;

    List list=new ArrayList();


    public Student(String name, Integer chinese, Integer math, Integer english) {
        this.name = name;
        Chinese = chinese;
        Math = math;
        English = english;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Integer getChinese() {
        return Chinese;
    }

    public void setChinese(Integer chinese) {
        Chinese = chinese;
    }

    public Integer getMath() {
        return Math;
    }

    public void setMath(Integer math) {
        Math = math;
    }

    public Integer getEnglish() {
        return English;
    }

    public void setEnglish(Integer english) {
        English = english;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum() {
        this.sum = Chinese+Math+English;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Integer getAverage() {
        return average;
    }

    public void setAverage() {
        this.average = sum/3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "姓名：'" + name + '\'' +
                "考试成绩：语文：" + Chinese +
                ", 数学：" + Math +
                ", 英语：" + English +
                "平均分：" + sum +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        this.setSum();
        this.setAverage();
        int num =  o.getSum()-this.sum;
        return num;
    }
}
