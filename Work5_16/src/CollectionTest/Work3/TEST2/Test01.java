package CollectionTest.Work3.TEST2;

import java.util.Random;
import java.util.TreeSet;


public class Test01 {
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<Student>();
        for(int i=0;i<40;i++) {
            Student stu=new Student();
            stu.setNum(180201+i);
            stu.setScore(50+new Random().nextInt(50));
            ts.add(stu);
        }

        for(Student stu:ts) {
            System.out.println("同学"+stu.getNum()+" 成绩："+stu.getScore());
        }
    }
}
