package Work3;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> arrayList=new ArrayList<Student>();
        ArrayList<TestQuestion> arrayList2=new ArrayList<TestQuestion>();

        arrayList.add(new Student(1,"张三","123",0));
        arrayList.add(new Student(2,"李四","123",0));
        arrayList.add(new Student(3,"王五","123",0));
        arrayList.add(new Student(4,"赵六","123",0));

        System.out.println(arrayList);

        arrayList2.add(new TestQuestion("题目一","a"));
        arrayList2.add(new TestQuestion("题目二","b"));
        arrayList2.add(new TestQuestion("题目三","c"));
        arrayList2.add(new TestQuestion("题目四","d"));
        System.out.println(arrayList2);


        int num=0;
        String password="0";
        Scanner scanner=new Scanner(System.in);
        System.out.println("学生考试系统登录");
        boolean i=true;
        while (i){
            System.out.println("请输入学号：");
            num = scanner.nextInt();
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(j).getNum().equals(num)){
                    break;
                }
            }
            System.out.println("请输入密码：");
            password=scanner.next();
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(j).getPassword().equals(password)){
                    i=false;
                    System.out.println("登录成功！");
                    break;
                }
            }
        }
        String option;
        System.out.println("开始答题");
        System.out.println("题目如下：");
        for (int j = 0; j < arrayList2.size(); j++) {
            System.out.println(arrayList2.get(j).getName());
            System.out.println("你的选择是：");
            option=scanner.next();
            if (arrayList2.get(j).getAnswer().equals(option)){
                System.out.println("回答正确!");
                arrayList.get(num).addScore(25);
            }else {
                System.out.println("回答错误~");
            }
        }
        System.out.println("你最终的分数是："+arrayList.get(num).getScore());





    }
}
