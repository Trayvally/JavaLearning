package ExceptionTest.Work1;

import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try {
            System.out.println("请输入分数：");
            int score = input.nextInt();
            if (score<0||score>100){
                throw new ScoreException("分数必须在1到100之间");
            }
            System.out.println("分数为："+ score);
        }catch (ScoreException e){
            System.out.println(e.toString());
            System.out.println(e.getMessage());//e.toString()获取的信息包括异常类型和异常详细消息，而e.getMessage()只是获取了异常的详细消息字符串。
            e.printStackTrace();//返回类型是一个StackTraceElement数组

        }
    }
}


