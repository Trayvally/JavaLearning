package ExceptionTest.Work2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        Scanner s3=new Scanner(System.in);
        System.out.println("请输入三条边（每输入一条边按一次回车）");
        int a=s1.nextInt();
        int b=s2.nextInt();
        int c=s3.nextInt();
        Test test=new Test();
        test.isTriangle(a,b,c);

    }

    void isTriangle(int a,int b,int c){
        try {
            if(a>b+c||b>a+c||c>a+b||a<=0||b<=0||c<=0){
                throw new IllegalArgumentException("a,b,c不能构成三角形");
            }
            System.out.println("三角形的三个边长分别为"+a+","+b+","+c);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
