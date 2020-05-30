package Work2.Lecture2;

import java.util.*;

import java.util.TreeSet;

public class Test02 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet=new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Name:");
            String name = sc.next();  //读取字符串型输入

            System.out.println("Chinese:");
            int chinese = sc.nextInt();    //读取整型输入
            System.out.println("Math:");
            int math = sc.nextInt(); //读取float型输入
            System.out.println("English:");
            int english = sc.nextInt();    //读取整型输入
            treeSet.add(new Student(name,chinese,math,english));

        }
        System.out.println(treeSet);


    }
}
